public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setAnnualSalary(400000.0);
        emp1.setName("Aakash Gupta");
        emp1.setJoiningYear("2021");
        emp1.setInsuranceNumber("12811007");

        System.out.print(
            "Person Name: "+emp1.getName()+
            "\nEmployee Annual Salary: "+emp1.getAnnualSalary()+
            "\nEmployee Joining Year: "+emp1.getJoiningYear()+
            "\nEmployee Insurance Number: "+emp1.getInsuranceNumber()
        );
    }
}
