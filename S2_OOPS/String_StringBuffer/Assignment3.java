import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String str1 = str.substring(0,2);

        str = str1;

        for(int i=1;i<5;i++){
            str = str.concat(str1);
        }

        System.out.println(str);
    }
}
