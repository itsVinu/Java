import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        int count = 0;
        int i=1;
        while(count<5){
            if(i%30 == 0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
}
