create database Employees;

use Employees;

create table Employees(
Empno int(4) not null primary key default 0,
Ename varchar(10) default null,
Job varchar(9) default null,
Mgr int(4) default null,
Hiredate date default null,
Sal decimal(7,2) default null,
Comm decimal(7,2) default null,
Deptno int(2) default null,
index(Deptno)
);