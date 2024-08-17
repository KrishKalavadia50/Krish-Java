create database Dept_Table;

use Dept_Table;

create table Dept(
Deptno int(2) not null primary key,
Dname varchar(14),
Loc varchar(13) 
);

insert into Dept (Deptno, Dname, Loc) values 
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');