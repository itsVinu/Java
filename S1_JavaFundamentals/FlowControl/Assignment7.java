import java.util.Scanner;

class Assignment7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char ch = s.nextLine().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(ch+"->"+Character.toLowerCase(ch));
        }
        else{
            System.out.println(ch+"->"+Character.toUpperCase(ch));
        }
    }
}
