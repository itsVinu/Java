public class UserRegistration {

    void registerUser(String username,String userCountry) throws InvalidCountryException{
        if(userCountry.compareTo("India") != 0){
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        try{
            UserRegistration obj1 = new UserRegistration();
            UserRegistration obj2 = new UserRegistration();

            obj2.registerUser("Aakash", "India");
            obj1.registerUser("Mickey", "US");
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }
}
