import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int cs=0, ms=0;
        for(int i=0;i<n;i++){
            cs = cs + arr[i];
            cs = cs<0?0:cs;
            ms = Integer.max(cs, ms);
        }
        System.out.println("Max sub array sum is: "+ms);
    }
}
