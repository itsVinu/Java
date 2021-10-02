import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000];
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg = sum/n;
        System.out.printf("Sum is %d and average is %d",sum,avg);
    }
}
