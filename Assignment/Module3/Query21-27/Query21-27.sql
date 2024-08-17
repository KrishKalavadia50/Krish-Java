SELECT * FROM employees WHERE Ename LIKE '%A%';
SELECT Ename, Job, Sal 
FROM employees 
WHERE (Job, Sal) IN (
    SELECT Job, MIN(Sal) FROM Employees 
GROUP BY Job
) 
ORDER BY Sal ASC;
SELECT * FROM Employees 
WHERE Sal > (SELECT Sal FROM Employees WHERE Ename = 'BLAKE');

CREATE VIEW v1 AS 
SELECT e.Ename, e.Job, d.Dname, d.Loc 
FROM Employees e 
JOIN DEPT d ON e.Deptno = d.Deptno;

DELIMITER $$
CREATE PROCEDURE GetEmployeeDetails (IN dno INT)
BEGIN
    SELECT e.Ename, d.Dname 
    FROM Employees e 
    JOIN DEPT d ON e.Deptno = d.Deptno 
    WHERE e.Deptno = dno;
END $$
DELIMITER ;
