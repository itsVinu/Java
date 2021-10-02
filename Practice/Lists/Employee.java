public class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId,String empName,String gender,String email,float salary){
        this.empId = empId;
        this.email = email;
        this.empName = empName;
        this.salary = salary;
        this.gender = gender;
    }

    public void getEmployeeDetails(){
        System.out.println("Name:"+empName);
        System.out.println("Email: "+email);
        System.out.println("Gender: "+gender);
        System.out.println("Salary: "+salary);
    }

    public int getEmpId(){
        return empId;
    }
}
