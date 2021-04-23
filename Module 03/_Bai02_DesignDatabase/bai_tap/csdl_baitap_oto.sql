drop database if exists csdl_oto;

create database csdl_oto;
use csdl_oto;

create table productsline(
id_productsline int primary key auto_increment not null,
mota_productsline varchar(255)
);
create table offices(
id_offices int primary key auto_increment not null,
address_offices varchar(255),
phone_offices char(11),
quocgia varchar(25)
);
create table employees(
id_employess int primary key auto_increment not null,
name_employess varchar(255),
email_employess varchar(255),
congviec varchar(50),
reportto varchar(255),
id_offices int,
foreign key(id_offices) references offices (id_offices)

);
create table customers(
id_customer int primary key auto_increment not null,
name_customer varchar(255),
phone_customer char(11),
address_customer varchar(255),
id_employess int,
foreign key (id_employess) references employees (id_employess)
);

create table orders(
id_order int primary key auto_increment not null,
ngaymua date,
ngayyeucaugiaohang date,
ngaygiaohangthucte date,
soluongdat int,
dongia int,
id_customer int,
foreign key(id_customer) references customers(id_customer)
);
create table products(
id_product int primary key auto_increment not null,
name_product varchar(255),
nhacungcap varchar(255),
soluongkho int,
gianhap int,
giaban int,
id_productsline int,
foreign key(id_productsline) references productsline(id_productsline)
);
create table orderdetails(
id_order int,
id_product int,
foreign key (id_order) references orders(id_order),
foreign key(id_product) references products(id_product)
);



create table payments(
id_payment int primary key auto_increment not null,
ngaythanhtoan date,
sotien int,
id_customer int,
foreign key(id_customer) references customers(id_customer)
);

