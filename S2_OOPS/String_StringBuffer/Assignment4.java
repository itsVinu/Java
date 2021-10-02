import java.util.Scanner;

class Assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int n = str.length();

        if(n%2 == 0){
            System.out.println(str.substring(0,n/2));
        }
        else{
            System.out.println("null");
        }
    }
}
