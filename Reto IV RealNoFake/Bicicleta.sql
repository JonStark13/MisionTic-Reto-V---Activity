create table bicicleta(
	bic_id INTEGER NOT NULL PRIMARY KEY,
    bic_marco CHAR(50)
    );

INSERT INTO bicicleta(bic_id, bic_marco) 
	VALUES(200,'M-1234'),
		(201,'M-4321'),
        (202,'M-1999'),
        (203,'M-1722'),
        (204,'M-1425'), -- BICICLETAS MTB
        (205,'RT-2727'),
        (206,'RT-1421'),
        (207,'RT-1811'),
        (208,'RT-1514'),
        (209,'RT-1111'),
        (210,'RT-1121'),
        (211,'RT-1014'),
        (212,'RT-2711'); -- BICICLETAS RUTA
        
