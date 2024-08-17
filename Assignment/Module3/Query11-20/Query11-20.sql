SELECT * FROM Employees WHERE Empno NOT LIKE '78%';

SELECT * FROM Employees WHERE Job = 'CLERK' AND Deptno = 20;

SELECT e.* 
FROM Employees e 
JOIN Employees m ON e.Mgr = m.Empno 
WHERE e.hiredate < m.hiredate;

SELECT * 
FROM Employees 
WHERE Job IN (SELECT Job FROM Employees WHERE Deptno = 10) 
AND Deptno = 20;

SELECT * 
FROM Employees 
WHERE Sal IN (SELECT Sal FROM Employees WHERE Ename IN ('FORD', 'SMITH')) 
ORDER BY Sal DESC;

SELECT * 
FROM Employees 
WHERE Job IN (SELECT Job FROM Employees WHERE Ename IN ('SMITH', 'ALLEN'));

SELECT DISTINCT Job 
FROM Employees 
WHERE Deptno = 10 
AND Job NOT IN (SELECT Job FROM Employees WHERE Deptno = 20);

SELECT MAX(Sal) AS Highest_Salary FROM Employees;

SELECT * 
FROM Employees 
WHERE Sal = (SELECT MAX(Sal) FROM Employees);

SELECT SUM(Sal) AS Total_Salary 
FROM Employees 
WHERE Empno IN (SELECT DISTINCT Mgr FROM Employees);
