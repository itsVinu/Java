import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int mc = 0, me=0;
        int [] count = new int[256];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
            if(count[arr[i]] > mc){
                mc = count[arr[i]];
                me = arr[i];
            }
        }
        System.out.println("Max freq element is: "+me);
        System.out.println("Max freq is: "+mc);
    }
}
