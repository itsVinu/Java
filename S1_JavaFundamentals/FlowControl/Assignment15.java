import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;

        while(n>0){
            sum+=n%10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
