drop database if exists thaotacvoibang;

create database thaotacvoibang;
use thaotacvoibang;

create table contacts(
contacs_id int (11) auto_increment,
birthday date,
constraint contacts_pk primary key (contacs_id)
);

create table suppliers(
supplier_id int (11) not null auto_increment,
supplier_name varchar(50) not null,
account_rep varchar(30) not null default 'TBD',
constraint suppliers_pk primary key(supplier_id)
);
create table customers (
id int primary key auto_increment,
ten varchar(50),
date_of_birth date
);

drop table customers;

alter table contacts 
add last_name varchar(40) not null
after contacs_id,
add first_name varchar(35) not null
after last_name;

alter table contacts modify last_name varchar (50) null;

alter table contacts drop column birthday;

alter table suppliers change column supplier_name name_supplier
varchar(20) not null;

