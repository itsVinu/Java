import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();

        System.out.println("Enter the elements in the array");
        
        try{
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int index = s.nextInt();
            System.out.printf("The array element at index %d = %d \n",index,arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
        catch(InputMismatchException e){
            System.out.println("java.lang.NumberFormatException");
        }
    }
}
