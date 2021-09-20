-- CREAR TABLAS E INICIALIZAR PROCESO: 
-- create schema carro
use carro;

-- MOSTRAR TABLAS E INFORMACION
-- show tables; -- mostrar tablas en Base de Datos
-- show columns from camioneta; -- Mostrar columnas de una tabla especifica
-- describe camioneta; -- Describir tabla

-- MODIFICAR Y ALTERAR TABLAS
-- DROP TABLE camioneta; -- borrar tabla
-- DELETE FROM camioneta WHERE cam_cilindraje=1000;
-- ALTER TABLE camioneta DROP vel_max;
-- ALTER TABLE camioneta ADD vel_max INTEGER NULL;
-- ALTER TABLE camioneta ADD cam_ciudad_placa VARCHAR(20) NOT NULL;
-- ALTER TABLE camioneta RENAME COLUMN cam_ciudad_placa TO cam_city_pla; 

-- CONSULTAR INFORMACION
SELECT * FROM camioneta WHERE cam_referencia LIKE '%X%'
	AND cam_cilindraje NOT LIKE 6000; 
SELECT * FROM camioneta WHERE cam_con_id LIKE '%1_01';
SELECT cam_placa, cam_cilindraje FROM camioneta;
SELECT * FROM camioneta;
SELECT * FROM carro.camioneta WHERE cam_placa='ABC-123'; -- UBICACION
SELECT * FROM camioneta ORDER BY cam_cilindraje ASC LIMIT 3; -- ORDENAR DE MENOR A MAYOR
SELECT * FROM camioneta ORDER BY cam_cilindraje DESC LIMIT 2; -- ORDENAR DE MAYOR A MENOR
SELECT AVG(cam_cilindraje) FROM camioneta; -- PROMEDIO
SELECT COUNT(cam_cilindraje) FROM camioneta; -- CONTAR
SELECT cam_pais, count(cam_id) FROM camioneta GROUP BY (cam_pais); -- AGRUPAR
SELECT cam_cilindraje, count(cam_id) FROM camioneta GROUP BY (cam_cilindraje)
	HAVING COUNT(cam_id)>1; -- MOSTRAR AGRUPANDO SEGUN CONTEO(CANTIDAD) 
SELECT cam_placa as 'PLACA', cam_con_id as 'CONCESIONARIO ID' FROM camioneta; -- NOMBRAR COLUMNAS
SELECT cam_placa, cam_con_id, con_ubicacion FROM camioneta, concesionario 
	WHERE camioneta.cam_con_id = concesionario.con_identificacion; -- UBICAR INFORMACION DE DOS TABLAS 	
    
-- AGREGAR O MODIFICAR INFORMACION
UPDATE camioneta SET cam_pais = 'Ecuador' WHERE cam_placa='JGW-808'; -- cambiar atributo
UPDATE camioneta SET cam_con_id=1101 WHERE cam_cilindraje=6000;

INSERT INTO concesionario(con_identificacion, con_ubicacion) 
	VALUES (1101, 'Bogotá Norte'); -- Insertar valores
    
INSERT INTO camioneta(cam_placa, cam_cilindraje, 
	cam_referencia, cam_con_id) 
    VALUES('JDK-524', 6000, '4X4', 1001),
			('JGW-808', 8000, 'EXPLORER', 1003),
			('HCU-410', 12000, 'PICK-UP', 1002),
            ('NEL-525', 10000, '4X4', 1001); 
    -- ENUM garantiza una condicion  

INSERT INTO camioneta(cam_placa, cam_cilindraje, 
	cam_referencia, cam_con_id, vel_max, cam_ciudad_placa) 
    VALUES('JKL-527', 2500, 'Compact', 1001, 300, 'Viracacha');

INSERT INTO camioneta(cam_placa, cam_cilindraje, 
	cam_referencia, cam_con_id) 
    VALUES('HCL-713', 12000, 'EXPLORER', 1002);
    
SELECT DISTINCT cam_pais FROM camioneta;




