import java.util.Scanner;

class Assignment7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        if(str.charAt(0) == 'x'){
            if(str.charAt(str.length()-1) == 'x'){
                System.out.println(str.substring(1,str.length()-1));
            }
            else{
                System.out.println(str.substring(1));
            }
        }
        else{
            System.out.println(str);
        }
    }
}
