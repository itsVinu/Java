import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int r=0;
        while(n>0){
            r = r*10 + n%10;
            n = n/10;
        }
        System.out.println(r);
    }
}
