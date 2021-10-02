import java.util.Scanner;

public class TargetSumPairs {

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

        sort(arr);

        int targetSum = s.nextInt();
        int i=0;
        int j=i+1;

        for(;i<n-1;i++){
            for(;j<n;j++){
                if((arr[i]+arr[j]) == targetSum){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+targetSum);
                    break;
                }
            }
        }
    }
}
