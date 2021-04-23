drop database if exists bt_view_index_store;

create database bt_view_index_store;
use bt_view_index_store;

create table products(
id int primary key,
product_code varchar(255),
product_name varchar(255),
product_price varchar(50),
product_amount varchar(255),
product_description varchar(255),
product_status varchar(255)
);

insert into products values
(1,'a','a',1,1,'a','a'),
(2,'b','b',2,1,'a','a'),
(3,'c','c',3,1,'a','a'),
(4,'d','d',4,1,'a','a');

-- Tạo index
select * 
from products;

create index idx_products on products (product_code);


-- Tạo view

create view view_products as select product_code,product_name,product_price,product_status
from products;


select *
from view_products;

-- Tạo store procedure
-- show full
 delimiter //
 create procedure show_full_products(in p_keyword varchar(255))
 begin 
 select *
 from products
 where p_keyword like ("full");
 end;
 //delimiter ;
 
 call p_keyword("full");
 
--  tìm sp
drop procedure if exists find_product;
delimiter //

create procedure find_product(in id_key int)
begin
 drop temporary table if exists find_product;
 create temporary table if not exists temp_find_prodcut as 
 (select * from products where id=id_key);
 select * from temp_find_prodcut;
 end//
 delimiter ;
 
 call find_product(4);
 
 -- xóa sp
 delimiter //
 create procedure del_product(in id_key int)
 begin 
 delete from products where products.id = id_key;
 end//
 delimiter ;
 
 call del_product(4);
 
 -- edit sp
 drop procedure if exists edit_product;
 delimiter //
 create procedure edit_product(in id_sp int, pr_edit text)
 begin 
 update products set products.product_description = pr_edit
 where products.id = id_sp;
 end//
 delimiter ;
 
 call edit_product(1,"huhu");

