import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[1000];
        int n = s.nextInt();
        
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();

        int i=0;
        for(;i<n;i++){
            if(arr[i] == key){
                System.out.println(i);
                break;
            }
        }
        if(i == n){
            System.out.println("-1");
        }
    }
}
