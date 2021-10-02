import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        String str = String.format(Integer.toBinaryString(i));

        System.out.println(str);

        s.close();
    }
}
