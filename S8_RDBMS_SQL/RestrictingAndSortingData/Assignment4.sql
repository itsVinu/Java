select last_name, jobID, hire_date from Employees 
where last_name = 'Matos' or last_name = 'Taylor' 
order by hire_date ASC;