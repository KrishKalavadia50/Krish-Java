create database Student_Table;

use Student_Table;

create table Students(
Rno int(2) not null primary key default 0,
Sname varchar(20) default null,
City varchar(20) default null,
State varchar(20) default null
);