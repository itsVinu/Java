import java.util.Scanner;

class Assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char x = s.next().charAt(0);

        if(Character.isLetter(x)){
            System.out.println("Alphabhet");
        }
        else if(Character.isDigit(x)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }    
}
