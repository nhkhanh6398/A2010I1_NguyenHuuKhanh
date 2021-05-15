drop database if exists demo;
CREATE DATABASE demo;
USE demo;

create table users (
 id  int NOT NULL AUTO_INCREMENT,
 `name` varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(`name`, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(`name`, email, country) values('Kante','kante@che.uk','Kenia');


select *
from users
order by `name`;

insert into users (`name`, email,country) value ('Khánh','nhkhanh@gmail.com','Laos');
update users
set `name`= "khánh", email = "khanh@123", country = "laos"
where id = 1;
select *
from users
where id = 1;

delete
from users
where id = 1;

select *
from users
where name like '%h%';