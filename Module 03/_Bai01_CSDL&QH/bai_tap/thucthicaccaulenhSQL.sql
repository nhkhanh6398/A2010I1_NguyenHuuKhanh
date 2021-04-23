drop database if exists customers_database;

create database customers_database;

use customers_database;

create table customers (
id int primary key auto_increment,
ten varchar(50),
date_of_birth date
);

insert into customers values (1,'Khánh','2021-03-31');
insert into customers (ten,date_of_birth) value ('Trung','2021-03-30'),
('Hiếu','2021-03-29'),
('Thông','2021-03-28'),
('Mai','2021-03-27');

alter table	customers add column email varchar (30);
update customers set email = 'nhkhanh.6398@gmail.com' where ten = 'Khánh';
update customers set email = 'lttrung.17ce@gmail.com' where ten = 'Trung';
update customers set email = 'nmhieu.17ce@gmail.com' where ten = 'Hiếu';
update customers set email = 'dtmai@gmail.com' where ten = 'Mai';
update customers set email = 'tcthong17ce@gmail.com' where ten = 'Thông';

-- select * from customers;
select ten from customers;