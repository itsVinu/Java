public class KidUser implements LibraryUser{
    int age=10;
    String bookType="Fiction";

    public void registerAccount(){
        if(age<12){
            System.out.println("Successfully registerd as a KidUser");
        }
    }
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println("Book issued successfully! Please return in 10days");
        }
        else{
            System.out.println("You're allowed to take only Kids books");
        }
    }
}
