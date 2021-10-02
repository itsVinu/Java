create table EMP(
    ID NUMERIC(7) PRIMARY KEY,
    LAST_NAME varchar2(25) NOT null,
    FIRST_NAME varchar2(25),
    DEPT_ID NUMERIC(7) FOREIGN KEY REFERENCES DEPT(Dept_ID)
);

Insert into EMP values(101,'Sam','Sundar',10),(101,'Ram','Krishna',20),(102,'Gopi',null,40),(103,null,'ram',20);