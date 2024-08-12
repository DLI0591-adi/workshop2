create table customers(customer_id int primary key, name varchar(50),email varchar(50));
create table orders(order_id int primary key, customer_id int,order_date date,total_amount int, foreign key(customer_id) references customers(customer_id)   );
create table products(product_id int primary key,product_name varchar(50),price int );
create table order_items(order_item_id int primary key,order_id int,product_id int,quantity int,foreign key(order_id) references orders(order_id),foreign key(product_id) references products(product_id));
create table categories(category_id int primary key,category_name varchar(50));

insert into customers(customer_id,name,email) VALUES (01,'adi','adiaggarwal@mail.com');
insert into customers(customer_id,name,email) VALUES (02,'adi1','adi1@mail.com') ;
insert into orders(order_id,customer_id,order_date,total_amount) values (1,01,'2024-10-25',10000);
insert into orders(order_id,customer_id,order_date,total_amount) values (2,02,'2022-9-22',50000);
select * from customers
select * from orders
DELETE FROM orders WHERE order_date > '2023-01-1';
