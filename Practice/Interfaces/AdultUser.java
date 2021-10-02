public class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age>12){
            System.out.println("Successfully registerd as a AdultUser");
        }else{
            System.out.println("Age must be greater than 12");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book issued successfully! Please return in 7days");
        }
        else{
            System.out.println("You're allowed to take only Fiction books");
        }
    }
}
