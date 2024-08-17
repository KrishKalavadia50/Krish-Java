create database Dept_Table;

use Dept_Table;

create table Dept(
Deptno int(2) not null primary key default 0,
Dname varchar(14) default null,
Loc varchar(13) default null
);