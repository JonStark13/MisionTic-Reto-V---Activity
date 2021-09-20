create table usuario(
	usr_id INTEGER NOT NULL PRIMARY KEY,
    usr_username CHAR(20),
    usr_nombre CHAR(20),
    usr_apellido CHAR(20),
    usr_email CHAR(30),
    usr_celular BIGINT,
    usr_clave CHAR(20),
    usr_fecha_nto DATE 
    );
    
INSERT INTO usuario(usr_id, usr_username, usr_nombre, usr_apellido) 
	VALUES(300,'lucky','Pedro','Perez'),
		(301, 'malopez', 'Maria', 'Lopez'),
		(302, 'diva', 'Ana', 'Diaz'),
		(303, 'dreamer', 'Luis', 'Rojas'),
		(304, 'ninja', 'Andrez', 'Cruz'),
		(305, 'neon', 'Nelson', 'Ruiz'),
		(306, 'rose', 'Claudia', 'Mendez'),
		(307, 'green', 'Jorge', 'Rodriguez');

			