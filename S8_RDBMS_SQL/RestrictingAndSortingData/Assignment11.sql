select employee_id, last_name, salary, departmentID from Employees 
where manager_id = &id order by &column_name;