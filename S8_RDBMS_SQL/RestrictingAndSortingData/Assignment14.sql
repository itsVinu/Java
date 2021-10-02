select last_name, jobID, salary from Employees 
where jobID = 'SA_REP' OR jobID = 'ST_CLERK' AND salary NOT IN (2500, 3500, 7000);