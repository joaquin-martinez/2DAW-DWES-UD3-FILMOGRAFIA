drop database if exists cine  ; 


create database cine ;
use cine ;
create table peliculas (
id  int AUTO_INCREMENT primary key ,
director varchar(128) not null ,
titulo varchar(128) not null ,
fecha datetime not null );

insert into peliculas (director , titulo , fecha ) values ('joaquin','pelicula joaquin parte1','2016-01-01 00:00:00'),
('juan','pelicula juan parte 1','2016-02-01 00:00:00'),
('joaquin','pelicula joaquin parte2','2016-03-01 00:00:00'),
('pepe','pelicula pepe parte 1','2016-04-01 00:00:00'),
('pepe','pelicula pepe parte 2','2016-05-01 00:00:00'),
('joaquin','pelicula joaquin parte3','2016-06-01 00:00:00');

select * from peliculas ;

select * from peliculas where director like 'joaquin' ;
