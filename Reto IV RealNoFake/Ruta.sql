CREATE TABLE ruta(
	rut_id INTEGER NOT NULL PRIMARY KEY,
    rut_velocidades INT,
    rut_peso INT,
    
    FOREIGN KEY(rut_id)	REFERENCES bicicleta(bic_id)
    );

INSERT INTO ruta(rut_id, rut_velocidades, rut_peso) 
        VALUES(205,33,11),
			(206,21,3),
            (207,30,3),
			(208,27,4),
            (209,24,10),
            (210,14,8),
            (211,16,12),
            (212,22,6);
            
