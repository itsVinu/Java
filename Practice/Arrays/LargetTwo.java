import java.util.Scanner;

public class LargetTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int l1 = Integer.MIN_VALUE, l2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>l1){
                l2 = l1;
                l1 = arr[i];

            }
            else if(arr[i]<l1 && arr[i]>l2){
                l2 = arr[i];
            }
        }
        System.out.println("Largest is: "+l1);
        System.out.println("Second largest is: "+l2);
    }
}
