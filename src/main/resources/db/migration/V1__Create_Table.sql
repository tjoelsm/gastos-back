DROP TABLE IF EXISTS gt_entidad;
CREATE TABLE gt_entidad (
  codEntidad SERIAL NOT NULL,
  nombre VARCHAR(250) NOT NULL,
  web VARCHAR(250) NOT NULL,
  CONSTRAINT pk_gtentidad PRIMARY KEY (codEntidad)
);
/*
* Abierto
*/
DROP TABLE IF EXISTS gt_periodo;
CREATE TABLE gt_periodo (
  periodo VARCHAR(6) NOT NULL,
  abierto boolean NOT NULL,
  CONSTRAINT pk_gtperiodo PRIMARY KEY (periodo)
);
