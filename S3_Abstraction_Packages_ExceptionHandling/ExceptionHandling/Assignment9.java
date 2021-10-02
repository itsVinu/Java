import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            System.out.printf("The quotient of %d/%d = %d\n",a,b,(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("DivideByZeroException caught");
        }
        finally{
            System.out.println("Inside finally block");
        }
    }
}
