public class Assignment8 {
    String username;
    int age;

    void setUsername(String name) throws ArrayIndexOutOfBoundsException{
        username = name;
    }
    void setAge(String age) throws ArrayIndexOutOfBoundsException, NumberFormatException,HandleAgeException{
        this.age = Integer.parseInt(age);
        if(this.age<18 || this.age>60){
            throw new HandleAgeException("Entered age should be greater than 17 and less than 61");
        }
        System.out.println("User registered");
    }
    public static void main(String[] args) {
        try{
            Assignment8 obj = new Assignment8();
            obj.setUsername(args[0]);
            obj.setAge(args[1]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
