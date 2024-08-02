# CRUD Backend Prueba tecnica para Azurian

## Descripción

Este proyecto es un CRUD de backend (Get, Post, Put, Delete) construido con Java 22, Spring Boot y JPA. Está diseñado para manejar operaciones básicas de gestión de datos en una aplicación.

## Requisitos

- [Java JDK 22](https://www.oracle.com/java/technologies/javase-jdk22-downloads.html)
- [Maven 3.9.8](https://maven.apache.org/download.cgi)
- [PostgreSQL]

## Instalación

 **Clonar el repositorio**

   Debes clonar el repositorio a tu máquina local usando el siguiente comando:

   `git clone https://github.com/yeme42/CRUD_BACKEND_JAVA.git`

# Ejecución del CRUD-Backend 

Antes de ejecutar el archivo de backend, puedes crear y configurar la base de datos en un contenedor Docker con los archivos de docker que deje en la raiz del proyecto. `En caso de no contar con docker en su sistema en la carpeta sql-scripts esta un archivo sql que contiene los scripts para crear una base de datos y usarla de manera local`. A continuación, se detallan los pasos a seguir para docker.

 **Comandos para crear la base de datos en Docker:**

Abre una terminal y navega hasta el directorio donde se encuentran los archivos `Dockerfile` y `Docker-compose`. Luego, ejecuta el siguiente comando para crear el contenedor de Docker, la base de datos, las tablas y cargar la información:

`docker compose up -d --build`

Luego de este comando tedra el entorno de Docker creado con la base de dato correctamente.

## Ejecuta el Archivo de Backend: CrudBackendApplication.java

Accede a la carpeta del proyecto `crud_backend` donde se encuentra el archivo `CrudBackendApplication.java` La ruta específica es:  `src/java/com/api/crud_backend`, presiona clic derecho sobre el archivo y selecciona la opción `Run Java` para iniciar la ejecución del backend.




