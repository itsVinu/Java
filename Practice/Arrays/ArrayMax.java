// import java.util.Scanner;

public class ArrayMax{
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        // int n = s.nextInt();

        int [] a = {1,2,4,3,7};

        int max=a[0], min=a[0];
        for(int i=1;i<5;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Max element of array is: "+max+" and Min element is: "+min);
    }
}