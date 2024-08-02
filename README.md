# CRUD Backend con Java, JPA y Spring Boot

## Descripción

Este proyecto es un backend CRUD (Crear, Leer, Actualizar, Eliminar) construido con Java 22, Spring Boot y JPA (Java Persistence API). Está diseñado para manejar operaciones básicas de gestión de datos en una aplicación.

## Requisitos

- [Java JDK 22](https://www.oracle.com/java/technologies/javase-jdk22-downloads.html)
- [Maven](https://maven.apache.org/) (para la gestión de dependencias y construcción del proyecto)
- [PostgreSQL](https://www.postgresql.org/) u otro sistema de gestión de bases de datos compatible

## Instalación

1. **Clonar el repositorio**

   Primero, clona el repositorio a tu máquina local usando el siguiente comando:

   git clone https://github.com/yeme42/CRUD_BACKEND_JAVA.git

## Manual de Ejecución del CRUD-Backend 

Este manual proporciona los pasos necesarios para ejecutar el archivo de backend CRUD. Antes de ejecutar el archivo de backend, es necesario crear y configurar la base de datos en un contenedor Docker. A continuación, se detallan los pasos a seguir.

## 	Preparación del Entorno
# Comandos de Docker *Crear la Base de Datos en Docker:

Localiza los Archivos de Configuración asegúrate de tener los archivos docker-compose.yml y Dockerfile en el directorio raíz del proyecto. Estos archivos contienen los comandos y scripts necesarios para la creación de la base de datos y las tablas, así como la carga de datos iniciales.

Abre una terminal y navega hasta el directorio donde se encuentran los archivos `Dockerfile` y `Docker-compose`. Luego, ejecuta el siguiente comando para crear el contenedor de Docker, la base de datos, las tablas y cargar la información:

`docker compose up -d --build`

Luego de este comando ya debería tener el entorno de Docker creado para la base de dato.

##  Ejecuta el Archivo de Backend: CrudBackendApplication.java

Accede a la Carpeta del Backend para levantar el proyecto:

Navega a la carpeta del proyecto `crud_backend` donde se encuentra el archivo `CrudBackendApplication.java`  presiona clic derecho sobre el archivo y selecciona la opción `Run Java` para iniciar la ejecución del backend.

La ruta específica es:  `src/java/com/api/crud_backend`

## Conclusion
Una vez que el backend esté en funcionamiento, debería estar listo para manejar las operaciones CRUD basadas en la base de datos configurada en Docker. Si encuentras algún problema durante el proceso, verifica los logs del contenedor Docker y asegúrate de que todos los archivos de configuración estén correctamente configurados.

