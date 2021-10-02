import java.util.Arrays;
import java.util.Scanner;

public class PossibleTriangles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count = 0;

        Arrays.sort(arr);
        for(int i=n-1;i>1;i--){
            int l = 0;
            int r = i-1;
            while(l<r){
                if(arr[l]+arr[r] > arr[i]){
                    count = count + r - l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        System.out.println("Possible number of triangles are: "+count);
        s.close();
    }
}
