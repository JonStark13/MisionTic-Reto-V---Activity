SELECT 'Consulta 1';
SELECT bic_marco FROM bicicleta ORDER BY bic_marco ASC;
SELECT 'Consulta 2';
SELECT bic_marco, mtb_descripcion, mtb_anio FROM bicicleta, mtb 
	WHERE bic_id=mtb_id AND mtb_anio>=2014 ORDER BY bic_marco ASC;
SELECT 'Consulta 3';
SELECT bic_marco FROM bicicleta, mtb WHERE mtb_id=bic_id AND mtb_creador=104;
SELECT 'Consulta 4';
SELECT bic_marco FROM bicicleta, venta WHERE ven_bic_id=bic_id AND ven_usr_id=300;
SELECT 'Consulta 5';
SELECT usr_username, usr_nombre, usr_apellido FROM usuario, venta
	WHERE usr_id=ven_usr_id AND ven_bic_id=201;
SELECT 'Consulta 6';
SELECT COUNT(mtb_id) FROM mtb WHERE mtb_anio>=2016;

