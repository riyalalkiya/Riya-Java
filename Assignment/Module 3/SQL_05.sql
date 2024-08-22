CREATE TABLE dept (
  Deptno INT,
  Dname VARCHAR(20),
  Loc VARCHAR(20)
);

INSERT INTO dept (Deptno,Dname,Loc) VALUES(10,'ACCOUNTING','NEW YORK');
INSERT INTO dept (Deptno,Dname,Loc) VALUES(20,'RESEARCH','DALLAS');
INSERT INTO dept (Deptno,Dname,Loc) VALUES(30,'SALES','CHICAGO');
INSERT INTO dept (Deptno,Dname,Loc) VALUES(40,'OPERATION','BOSTON');

SELECT * FROM dept WHERE Deptno <= 40;



