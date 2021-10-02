import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

    List<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e){
        return list.add(e);
    }

    boolean deleteEmployee(int empid){
        for(Employee e:list){
            if(e.getEmpId() == empid){
                list.remove(e);
                System.out.println("Item with id: "+empid+" has been deleted successfully");
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : list) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}
		return paySlip;
	}

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"AAKASH","xyz@gmail.com","Male",3.5F);
        Employee e2 = new Employee(2,"Varun","xyz@gmail.com","Male",3.5F);
        Employee e3 = new Employee(3,"Megha","xyz@gmail.com","Female",3.5F);
        Employee e4 = new Employee(4,"Vinay","xyz@gmail.com","Male",3.5F);

        EmployeeDB emp = new EmployeeDB();
        emp.addEmployee(e1);
        emp.addEmployee(e2);
        emp.addEmployee(e3);
        emp.addEmployee(e4);

        emp.deleteEmployee(e1.getEmpId());
        System.out.println(emp.showPaySlip(e3.getEmpId()));

    }
}
