DROP TABLE admin CASCADE CONSTRAINT;
DROP TABLE medicamento CASCADE CONSTRAINT;
DROP TABLE paciente CASCADE CONSTRAINT;
DROP TABLE procedimiento CASCADE CONSTRAINT;
DROP TABLE tecnico CASCADE CONSTRAINT;

CREATE DATABASE ;

CREATE TABLE administrador (
    id_admin   VARCHAR2(16) NOT NULL,
    usuario    VARCHAR2(125) NOT NULL,
    contrasena VARCHAR2(60) NOT NULL
);

ALTER TABLE admin ADD CONSTRAINT admin_pk PRIMARY KEY ( id_admin );

ALTER TABLE admin ADD CONSTRAINT admin_usuario_un UNIQUE ( usuario );

CREATE TABLE medicamento (
    id_med   NUMBER(8) NOT NULL,
    nombre   VARCHAR2(25) NOT NULL,
    precio   NUMBER(16) NOT NULL,
    cantidad NUMBER(8) NOT NULL
);

ALTER TABLE medicamento ADD CONSTRAINT medicamento_pk PRIMARY KEY ( id_med );

CREATE TABLE paciente (
    run_pac              NUMBER(8) NOT NULL,
    nombre               VARCHAR2(25) NOT NULL,
    diagnostico          VARCHAR2(25) NOT NULL,
    medicamento_id_med   NUMBER(8) NOT NULL,
    procedimiento_id_med NUMBER(8) NOT NULL
);

ALTER TABLE paciente ADD CONSTRAINT paciente_pk PRIMARY KEY ( run_pac );

CREATE TABLE procedimiento (
    id_med      NUMBER(8) NOT NULL,
    nombre      VARCHAR2(25) NOT NULL,
    precio      NUMBER(16) NOT NULL,
    descripcion VARCHAR2(225)
);

ALTER TABLE procedimiento ADD CONSTRAINT procedimiento_pk PRIMARY KEY ( id_med );

CREATE TABLE tecnico (
    run_tec          NUMERIC(8) NOT NULL,
    usuario          VARCHAR2(25) NOT NULL,
    contrasena       VARCHAR2(60) NOT NULL,
    paciente_run_pac NUMBER(8) NOT NULL,
    admin_id_admin   VARCHAR2(16) NOT NULL
);

ALTER TABLE tecnico ADD CONSTRAINT tecnico_pk PRIMARY KEY ( run_tec );

ALTER TABLE paciente
    ADD CONSTRAINT paciente_medicamento_fk FOREIGN KEY ( medicamento_id_med )
        REFERENCES medicamento ( id_med );

ALTER TABLE paciente
    ADD CONSTRAINT paciente_procedimiento_fk FOREIGN KEY ( procedimiento_id_med )
        REFERENCES procedimiento ( id_med );

ALTER TABLE tecnico
    ADD CONSTRAINT tecnico_admin_fk FOREIGN KEY ( admin_id_admin )
        REFERENCES administrador ( id_admin );

ALTER TABLE tecnico
    ADD CONSTRAINT tecnico_paciente_fk FOREIGN KEY ( paciente_run_pac )
        REFERENCES paciente ( run_pac );

INSERT INTO administrador VALUES ('A001', 'pepito', 'grandepepito');

INSERT INTO medicamento VALUES (1001, 'Paracetamol', 1500, 100);
INSERT INTO medicamento VALUES (1002, 'Ibuprofeno', 2000, 50);
INSERT INTO medicamento VALUES (1003, 'Amoxicilina', 3500, 80);
INSERT INTO medicamento VALUES (1004, 'Aspirina', 1200, 200);

INSERT INTO paciente VALUES (12345678, 'Juan Pérez', 'Gripe', 1001, 1001);
INSERT INTO paciente VALUES (23456789, 'Ana Gómez', 'Infección respiratoria', 1002, 1002);
INSERT INTO paciente VALUES (34567890, 'Carlos Ramírez', 'Dolor abdominal', 1003, 1003);
INSERT INTO paciente VALUES (45678901, 'Marta López', 'Hipertensión', 1004, 1004);

INSERT INTO procedimiento VALUES (1001, 'Toma de presión arterial', 5000, 'Medición de la presión arterial del paciente.');
INSERT INTO procedimiento VALUES (1002, 'Aplicación de vacuna', 15000, 'Aplicación de vacunas de rutina como antigripal o tétanos.');
INSERT INTO procedimiento VALUES (1003, 'Curación de heridas', 7000, 'Limpieza y curación de heridas superficiales.');
INSERT INTO procedimiento VALUES (1004, 'Toma de muestras', 8000, 'Toma de muestras de sangre o exudados para análisis.');

INSERT INTO tecnico VALUES (12345678, 'Laura Martínez', 'clave1234', 12345678, 'A001');
INSERT INTO tecnico VALUES (23456789, 'Pedro Sánchez', 'clave2345', 23456789, 'A001');
INSERT INTO tecnico VALUES (34567890, 'Sofía González', 'clave3456', 34567890, 'A001');
INSERT INTO tecnico VALUES (45678901, 'Miguel Torres', 'clave4567', 45678901, 'A001');

