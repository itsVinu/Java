import java.util.Scanner;

class Assignment8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int i = str.indexOf("*");

        System.out.println(str.substring(0,i-1)+str.substring(i+2));


    }
}
