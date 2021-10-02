public class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private Float salary;

    public Employee(int empId,String empName,String email,String gender,Float salary){
        this.empId = empId;
        this.email = email;
        this.empName = empName;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId(){
        return empId;
    }
    public Float getEmpSalary(){
        return salary;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee details are as follows: ");
        System.out.println("Name: "+empName);
        System.out.println("Mail Id: "+email);
        System.out.println("Gender: "+gender);
        System.out.println("Salary: "+salary);
    }
}
