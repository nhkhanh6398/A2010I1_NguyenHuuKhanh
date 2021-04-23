drop database if exists xacdinhkhoachinhvakhoangoai;

create database xacdinhkhoachinhvakhoangoai;
use xacdinhkhoachinhvakhoangoai;

create table customers(
id_customer int auto_increment primary key,
fullname varchar (255),
address varchar (255),
email varchar(255),
phone char(11)
);

create table accounts(
id_account int auto_increment primary key,
account_type varchar (255),
dayaccount date,
balance int,
customers_id int,

foreign key (customers_id) references customers(id_customer)
);

create table transactions (
id_tran int auto_increment primary key,
account_number int,
date_tran date,
amounts int,
descriptions varchar(255),
account_id int,
foreign key(account_id) references accounts(id_account)
);