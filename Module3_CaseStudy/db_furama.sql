drop database if exists db_furama;

create database db_furama;

use db_furama;

create table position (
	position_id int primary key,
    position_name varchar(45)
);

create table education_degree (
	education_degree_id int primary key,
    education_degree_name varchar(45)
);

create table division (
	division_id int primary key,
    division_name varchar(45)
);

create table `user` (
	username varchar(225) primary key,
    `password` varchar(225)
);

create table `role`(
	role_id int primary key,
    role_name varchar(225)
);

create table user_role (
	role_id int,
    username varchar(225),
    
    foreign key (username) references `user` (username),
    foreign key (role_id) references `role` (role_id)
);


create table service_type (
	service_type_id int primary key,
    service_type_name varchar(45)
);

create table rent_type (
	rent_type_id int primary key,
    rent_type_name varchar(45),
    rent_type_cost double
);

create table attach_service (
	attach_service_id int primary key,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45)
);

create table employee (
	employee_id int primary key,
    employee_name varchar(45),
    employee_birthday date,
    employee_id_card varchar(45),
    employee_salary double,
    employee_phone varchar(45),
    employee_email varchar(45),
    employee_address varchar(45),
    position_id int,
    education_degree_id int,
    division_id int,
    username varchar(225),
    
    foreign key (position_id) references position (position_id),
    foreign key (education_degree_id) references education_degree (education_degree_id),
    foreign key (division_id) references division (division_id),
    foreign key (username) references user (username)
);

create table customer_type (
	customer_type_id int primary key,
    customer_type_name varchar(45)
);


create table customer (
	customer_id int primary key auto_increment,
    customer_type_id int,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender varchar(5),
    customer_id_card varchar(45),
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45),
    
    foreign key (customer_type_id) references customer_type (customer_type_id)
);



create table service (
	service_id int primary key,
    service_name varchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double,
    number_of_floors int,
    
    foreign key (rent_type_id) references rent_type (rent_type_id),
    foreign key (service_type_id) references service_type (service_type_id)
);

create table contract (
	contract_id int primary key,
    contract_start_date datetime,
	contract_end_date datetime,
	contract_deposit double,
	contract_total_money double,
	employee_id int,
    customer_id int,
    service_id int,
    
    foreign key (employee_id) references employee (employee_id),
    foreign key (customer_id) references customer (customer_id),
    foreign key (service_id) references service (service_id)
);
create table contract_detail (
	contract_detail_id int primary key,
    contract_id int,
    attach_service_id int,
    quatily int,
    
    foreign key (contract_id) references contract (contract_id),
    foreign key (attach_service_id) references attach_service (attach_service_id)
);
INSERT INTO `db_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('1', 'Diamond');
INSERT INTO `db_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('2', 'Platinium');
INSERT INTO `db_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('3', 'Gold');
INSERT INTO `db_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('4', 'Silver');
INSERT INTO `db_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('5', 'Member');

insert into customer value (1,1,'Nguyễn Hữu Khánh','1998/09/12','nam','123456789','03366897','nhkhanh@gmail.com','Đà Nẳng');
insert into customer value(2,1,'Trần Thị Thu Hiền','1998/03/20','nữ','123456789','03366897','ttthien@gmail.com','Đà Nẳng'),
(3,2,'Nguyễn Minh Hiếu','1999/10/12','nam','123456789','03366897','mhieu@gmail.com','Gia Lai'),
(4,3,'Nguyễn Khánh Bun','2006/03/12','nam','123456789','03366897','kbun@gmail.com','Quảng Trị');
INSERT INTO `db_furama`.`customer` (`customer_id`, `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) VALUES ('5', '4', 'Lê Hoài An', '1990-05-03', 'nam', '123465789', '1234685', 'han@gmail.com', 'Huế');
INSERT INTO `db_furama`.`customer` (`customer_id`, `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) VALUES ('6', '4', 'Võ Vũ Thuận', '1997-03-05', 'nam', '65894632', '02668559', 'vthuan@gmail.com', 'Quảng Bình');
INSERT INTO `db_furama`.`customer` (`customer_id`, `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) VALUES ('7', '5', 'Võ Thị Thùy Nhung', '1997-12-21', 'nữ', '336659532', '03456226', 'tnhung@gmail.com', 'Quảng Trị');

INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('1', 'Lễ Tân');
INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('2', 'Phục Vụ');
INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('3', 'Chuyên Viên');
INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('4', 'Giám Sát');
INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('5', 'Quản Lý');
INSERT INTO `db_furama`.`position` (`position_id`, `position_name`) VALUES ('6', 'Giám Đốc');
INSERT INTO `db_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('1', 'Trung cấp');
INSERT INTO `db_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('2', 'Cao đẳng');
INSERT INTO `db_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('3', 'Đại học');
INSERT INTO `db_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('4', 'Sau đại học');

INSERT INTO `db_furama`.`division` (`division_id`, `division_name`) VALUES ('1', 'Sale – Marketing');
INSERT INTO `db_furama`.`division` (`division_id`, `division_name`) VALUES ('2', 'Hành Chính');
INSERT INTO `db_furama`.`division` (`division_id`, `division_name`) VALUES ('3', 'Phục vụ');
INSERT INTO `db_furama`.`division` (`division_id`, `division_name`) VALUES ('4', 'Quản lý');

-- update customer
-- set customer_type_id = 2, customer_name = 'hihi', customer_birthday = '2016/05/06', customer_gender = 'nam',
-- customer_id_card ='112566', customer_phone = '036997754', customer_email = 'nhkhanh@gmail.com', customer_address = 'd'
-- where customer_id = 3;