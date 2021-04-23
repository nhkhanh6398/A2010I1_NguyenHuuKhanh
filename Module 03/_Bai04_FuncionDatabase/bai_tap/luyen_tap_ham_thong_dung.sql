drop database if exists bt_funcion_database;

create database  bt_funcion_database;
use bt_funcion_database;

create table hocvien( 
id int primary key auto_increment not null,
ten varchar(255),
tuoi int,
khoahoc char(25),
sotien double
);

insert into hocvien value(1,'Hoang',21,'CNTT',400000);
insert into hocvien(ten,tuoi,khoahoc,sotien)
value ('Viet',19,'DTVT',320000),('Thanh',18,'KTDN',320000), ('Nhan',20,'CK',420000),
 ('Huong',19,'TCNH',320000),('Huong',19,'TCNH',500000);
 
 select *
 from hocvien
 where ten = 'Huong';
 
 select ten,sum(sotien)
 from hocvien
 where ten = 'Huong';
 
 select distinct ten
 from hocvien;
 