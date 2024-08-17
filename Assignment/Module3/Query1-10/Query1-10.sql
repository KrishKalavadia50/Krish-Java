SELECT DISTINCT Job FROM Employees;

SELECT * FROM Employees ORDER BY Deptno ASC, Job DESC;

SELECT DISTINCT Job FROM Employees ORDER BY Job DESC;

SELECT * FROM Employees WHERE hiredate < '1981-01-01';

SELECT Empno, Ename, Sal, 
       ROUND(Sal/30) AS "Daily Sal", 
       ROUND(Sal*12) AS "Annsal"
FROM Employees 
ORDER BY "Annsal" ASC;

SELECT Empno, Ename, Sal, 
       (YEAR(CURDATE()) - YEAR(hiredate)) AS "Exp"
FROM Employees 
WHERE Mgr = 7369;

SELECT * FROM Employees WHERE Comm > Sal;

SELECT * FROM Employees WHERE Job IN ('CLERK', 'ANALYST') ORDER BY Ename DESC;

SELECT * FROM Employees WHERE (Sal * 12) BETWEEN 22000 AND 45000;

SELECT Ename FROM Employees WHERE Ename LIKE 'S____';

