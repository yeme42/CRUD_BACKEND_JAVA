FROM postgres:latest

WORKDIR /docker-entrypoint-initdb.d

COPY sql-scripts/*.sql /docker-entrypoint-initdb.d/


ENV POSTGRES_DB=azurian
ENV POSTGRES_USER=yme
ENV POSTGRES_PASSWORD=yme