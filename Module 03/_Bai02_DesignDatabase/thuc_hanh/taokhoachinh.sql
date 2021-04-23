drop database if exists taokhoachinh;

create database taokhoachinh;
use taokhoachinh;

create table users(
user_id int auto_increment primary key,
username varchar(40),
password varchar(40),
email varchar(255)
);
CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);
CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);