import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        int sum=0,j;

        for(int i=0;i<n;i++){
            if(a[i] == 6){
                j=i;
                while(j<n){
                    if(a[j] == 7){
                        i=j;
                        break;
                    }
                    else{
                        j++;
                    }
                }
                if(j == n){
                    sum+=a[i];
                }
            }
            else{
                sum += a[i];
            }
        }
        System.out.print(sum);

    }
}
