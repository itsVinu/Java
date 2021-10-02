insert into DEPT select department_id, first_name from DEPARTMENTS ;

insert into DEPT values(10,'Accounts'),(null,'TT'),(A1,'Accounts');

update DEPT
set Dept_ID = 20 where Dept_ID = null;

update DEPT
set Dept_ID = 30 where Dept_ID = A1;