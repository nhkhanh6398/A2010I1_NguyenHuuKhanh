drop database if exists truyvandulieunangcao;
create database truyvandulieunangcao;
use truyvandulieunangcao;

create table productlines(
productline_id int primary key auto_increment,
text_description varchar(255),
html_description varchar(255),
image blob
);
create table products(
product_id int primary key auto_increment,
product_name varchar(255),
productline_id int,
product_scale varchar (255),
product_vendor varchar(255),
product_description varchar(255),
quantityln_stock varchar(255),
buy_price varchar(50),
msrp varchar(50),
foreign key(productline_id) references productlines(productline_id)
);

select product_id , product_name, buy_price, quantityln_stock from products
where buy_price > 56.76 and quantityln_stock > 10;

SELECT product_id,product_name, buy_price, text_description
FROM products
INNER JOIN productline_id
ON products.productline_id = productlines.productline_id
WHERE buyprice > 56.76 AND buyprice < 95.59