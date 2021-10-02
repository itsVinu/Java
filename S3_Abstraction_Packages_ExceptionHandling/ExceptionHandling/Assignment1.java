import java.util.Scanner;

class Assignment1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        
        try {
            int num = Integer.parseInt(str);
            System.out.println("The square value is: "+(num*num));
            System.out.println("The work has been done successfully");
        } catch (Exception e) {
            System.out.println("Entered input is not a valid format for an integer");
        }
    }
}