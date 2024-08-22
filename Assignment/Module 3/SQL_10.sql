DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  Empno INT,
  Ename VARCHAR(20),
  Job VARCHAR(20),
  Mgr INT,
  Hiredate DATE,
  Sal DECIMAL(7,2),
  Comm DECIMAL(7,2),
  Deptno INT
);

INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
 VALUES(1,'RIYA','CLERK',7902,'1980-12-17',800,0,20);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(2,'RUTVI','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
 VALUES(3,'DHULI','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(4,'RONAK','MANAGER',7839,'1981-04-02',2975,0,20);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(5,'JANVI','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(6,'KRSHA','MANAGER',7839,'1981-05-01',2850,0,30);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
 VALUES(7,'DIPEN','MANAGER',7839,'1981-06-09',2450,0,10);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
 VALUES(8,'TARUN','ANALYST',7566,'1982-12-09',3000,0,20);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(9,'KRISH','PRESIDENT',0,'1981-11-17',5000,0,10);
INSERT INTO employees (Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno) 
VALUES(10,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);

SELECT * 
FROM employees 
WHERE Hiredate < '1981-01-01';


