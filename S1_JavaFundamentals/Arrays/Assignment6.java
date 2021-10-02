import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000];
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        for(int i=1;i<n;i++){
            int e = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>e){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = e;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
