import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000];
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("Min in array is %d and Max in array is %d",min,max);
    }
}
