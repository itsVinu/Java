import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {
    public static void sort(int a[]){
        for(int i=1;i<a.length;i++){
            int e = a[i];
            int j=i-1;
            while(j>=0 && a[j]>e){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = e;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        // sort(arr);
        Arrays.sort(arr);

        int targetSum = s.nextInt();

        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r = n-1;
            while(l<r){
                if(arr[l]+arr[r]+arr[i] == targetSum){
                    System.out.println(arr[l]+","+arr[r]+","+arr[i]);
                    break;
                }
                else if(arr[l]+arr[r]+arr[i] > targetSum){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
    }
}
