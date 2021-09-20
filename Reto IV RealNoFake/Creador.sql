create table creador(
	cre_id INTEGER NOT NULL PRIMARY KEY,
    cre_nombre CHAR(20),
    cre_apellido CHAR(20),
    cre_nacionalidad CHAR(40)
    );
    
    
INSERT INTO creador(cre_id, cre_nombre, cre_apellido,
	cre_nacionalidad) 
	VALUES(100,'Carlos','Perez','japones'),
		(101, 'Joss', 'Mora', 'estadounidense'),
		(102, 'Christopher', 'Salazar', 'estadounidense'),
		(103, 'James', 'Carvajal', 'coreano'),
		(104, 'Vincent', 'Chung', 'neozelandes');
