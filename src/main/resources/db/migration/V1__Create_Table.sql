DROP TABLE IF EXISTS gt_entidad;
CREATE TABLE gt_entidad (
  codEntidad Integer NOT NULL,
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
DROP TABLE IF EXISTS gt_grupogasto;
CREATE TABLE gt_grupogasto (
  cod_grupo Integer NOT NULL,
  grupo_gasto VARCHAR(200) NOT NULL,
  ahorro boolean,
  CONSTRAINT pk_grupogasto PRIMARY KEY (cod_grupo)
);

DROP TABLE IF EXISTS gt_tipogasto;
CREATE TABLE gt_tipogasto (
  cod_tipo_gasto Integer NOT NULL,
  grupo_gasto Integer NOT NULL,
  tipo_gasto VARCHAR(200) NOT NULL,
  activo boolean NOT NULL,
  valor_defecto decimal,
  fecha_baja Timestamp,
  CONSTRAINT pk_gttipogasto PRIMARY KEY (cod_tipo_gasto, grupo_gasto)
);

DROP TABLE IF EXISTS gt_gastos;
CREATE TABLE gt_gastos (
  id_registro SERIAL NOT NULL,
  periodo VARCHAR(6) NOT NULL,
  cod_tipo_gasto Integer NOT NULL,
  importe decimal,
  CONSTRAINT pk_gtgastos PRIMARY KEY (id_registro, periodo, cod_tipo_gasto)
);
