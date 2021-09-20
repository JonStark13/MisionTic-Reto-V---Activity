create table mtb(
	mtb_id INTEGER NOT NULL PRIMARY KEY,
	mtb_descripcion CHAR(250),
    mtb_anio INTEGER,
    mtb_creador INT UNIQUE,
    
	foreign key(mtb_id)	references bicicleta(bic_id),
    foreign key(mtb_creador) references creador(cre_id)
    );

INSERT INTO mtb(mtb_id, mtb_descripcion, mtb_anio,
		mtb_creador) 
        VALUES(200,'Bicicleta de montaña con alto nivel competitivo, con marco en fibra de carbono, grupo de cambios Shimano Alivio.',2014,101),
			(201,'Bicicleta de montaña con medio nivel competitivo, con marco en aluminio, grupo de cambios Shimano Turney',2016,102),
            (202,'Bicicleta de montaña con excelente nivel competitivo, con marco en fibra de carbono, grupo de cambios Shimano Deore.',2017,100),
            (203,'Bicicleta de montaña para uso casual, con marco en hierro y aluminio, grupo de cambios Shimano básico.',2017,103),
            (204,'Bicicleta de montaña con máximo nivel competitivo, con marco en fibra de carbono, grupo de cambios Shimano Slx.',2015,104);
            
