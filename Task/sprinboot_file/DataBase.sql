create database contact_app;
use contact_app;
create table users_contact
(id INT auto_increment primary key,
name varchar(100) not null,
email varchar(100) not null unique,
phone varchar(13) not null,
city varchar(100),
message text,
create_at timestamp default current_timestamp);
select* from users_contact;
