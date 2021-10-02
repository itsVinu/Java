import java.util.Scanner;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int []count = new int[1000];
        int j=0;
        for(int i=0;i<n;i++){
            count[arr[i]]++;
            if(count[arr[i]] == 1){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }

    }
}
