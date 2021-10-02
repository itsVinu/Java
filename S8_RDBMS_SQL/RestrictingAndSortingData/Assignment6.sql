select concat(first_name,' ',last_name) as Employee , salary as "Monthly Salary" from Employees 
where salary between 5000 and 12000
and departmentID = 20 or departmentID = 50;