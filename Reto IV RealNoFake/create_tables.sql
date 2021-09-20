
CREATE TABLE concesionario(
	con_identificacion INTEGER(10) NOT NULL PRIMARY KEY,
	con_ubicacion VARCHAR(20) NOT NULL	
);

CREATE TABLE camioneta(
	cam_id INTEGER NOT NULL auto_increment,
	cam_placa VARCHAR(7) NOT NULL unique,
	cam_cilindraje INT(5) NOT NULL,
	cam_referencia VARCHAR(30) NULL,
	cam_con_id INTEGER(10) NOT NULL,
	cam_pais ENUM('Colombia','Ecuador','Venezuela')
	default 'Colombia',
    
	primary	key(cam_id),
	foreign key(cam_con_id)	references concesionario(con_identificacion)
);  

