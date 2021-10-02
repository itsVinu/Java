import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
    ArrayList<Employee> emp = new ArrayList<Employee>();

    boolean addEmployee(Employee e){
        emp.add(e);
        return true;
    }
    boolean deleteEmployee(int empId){
        for(Employee e:emp){
            if(e.getEmpId() == empId){
                emp.remove(e);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeDB e = new EmployeeDB();
        e.addEmployee(new Employee(1,"AAKASH","aakash@gmail.com","Male",350000f));
        e.addEmployee(new Employee(2,"XYZ","xyz@gmail.com","Female",350000f));
        e.addEmployee(new Employee(3,"VARUN","varun@gmail.com","Male",450000f));
        e.addEmployee(new Employee(4,"VINAY","vinay@gmail.com","Male",360000f));

        e.deleteEmployee(3);

    }
}
