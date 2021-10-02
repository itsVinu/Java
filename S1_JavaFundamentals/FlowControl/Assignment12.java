import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=2;

        for(;i<=n/2;i++){
            if(n%i == 0){
                System.out.println("Not Prime");
                break;
            }
        }
        if(i == 1 || i>n/2){
            System.out.println("Prime");
        }
    }
}
