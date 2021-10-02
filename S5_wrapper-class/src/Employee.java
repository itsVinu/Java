public class Employee {
    private String name;
    private int age;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Employee(Employee e){
        this.name = e.name;
        this.age = e.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("Employee Name :"+name);
        System.out.println("Employee age :"+age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Aakash", 22);
        Employee e2 = new Employee(e1);

        e1.display();
        e2.display();

        e1.setAge(23);
        e1.setName("Aakash Gupta");
        e1.display();
        e2.display();
    }
}
