import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000];
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min1=arr[0],min2=arr[0],max1=arr[0],max2=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2 && arr[i]>min1){
                min2 = arr[i];
            }
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1){
                max2 = arr[i];
            }
        }
        System.out.println(min1+" "+min2);
        System.out.println(max1+" "+max2);
    }
}
