
CREATE SCHEMA IF NOT EXISTS public AUTHORIZATION pg_database_owner;

CREATE TABLE public.usuarios (
	id int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
	nombre varchar NOT NULL,
	apellido varchar NOT NULL,
	correo varchar NOT NULL,
	CONSTRAINT usuarios_pk PRIMARY KEY (id)
);



INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Valeria', 'Ortíz', 'valeria.ortiz@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Andrés', 'Morales', 'andres.morales@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Juliana', 'Castro', 'juliana.castro@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Fernando', 'Jiménez', 'fernando.jimenez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Carmen', 'Pineda', 'carmen.pineda@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Ana', 'García', 'ana.garcia@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Luis', 'Martínez', 'luis.martinez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('María', 'Hernández', 'maria.hernandez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Juan', 'Pérez', 'juan.perez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Laura', 'González', 'laura.gonzalez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Carlos', 'Rodríguez', 'carlos.rodriguez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Isabel', 'Fernández', 'isabel.fernandez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Miguel', 'López', 'miguel.lopez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Sofía', 'Ramírez', 'sofia.ramirez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Jorge', 'Torres', 'jorge.torres@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Gabriela', 'Mendoza', 'gabriela.mendoza@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Ricardo', 'Vásquez', 'ricardo.vasquez@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Valeria', 'Ortíz', 'valeria.ortiz@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Andrés', 'Morales', 'andres.morales@example.com');
INSERT INTO public.usuarios
(nombre, apellido, correo)
VALUES('Juliana', 'Castro', 'juliana.castro@example.com');