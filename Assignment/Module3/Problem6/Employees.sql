create database Employees;

use Employees;

create table Employees(
Empno int(4) not null primary key default 0,
Ename varchar(10),
Job varchar(9),
Mgr int(4), 
Hiredate date,
Sal decimal(7,2),
Comm decimal(7,2),
Deptno int(2),
index(Deptno)
);

insert into Employees(Empno, Ename, Job, Mgr, Hiredate, Sal, Comm, Deptno) values
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, null, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 800.00, 300.00, 20),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-20', 800.00, 500.00, 20),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 800.00, null, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 800.00, 1400.00, 20),
(7698, 'BLACK', 'MANAGER', 7839, '1981-05-01', 800.00, null, 20),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 800.00, null, 20),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 800.00, null, 20),
(7839, 'KING', 'PRESIDENT', null, '1981-11-17', 800.00, null, 20),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', 800.00, 0.00, 20),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 800.00, null, 20);

