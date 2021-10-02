class Teacher extends Person{
    private double salary;
    private String subject;

    public void setSalary(double s){
        salary = s;
    }
    public void setSubject(String sub){
        subject = sub;
    }

    public String getSubject(){
        return subject;
    }
    public double getSalary(){
        return salary;
    }
}
