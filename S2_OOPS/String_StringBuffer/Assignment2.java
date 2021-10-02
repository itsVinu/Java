import java.util.Scanner;

class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();
        String str2 = s.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            str2 = str2.substring(1);
        }

        System.out.println(str1.concat(str2));
    }
}
