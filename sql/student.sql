drop database if exists Student;
create database Student;

use Student;

create table basicInformation
(
    Id        int primary key auto_increment,
    sId       varchar(10) not null,
    sName     varchar(5)  not null,
    sClass1   varchar(6)  not null,
    sLocation varchar(6)  not null,
    sClass2   varchar(8)  not null
);