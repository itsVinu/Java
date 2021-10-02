import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000];
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print((char)arr[i]);
        }
    }
}
