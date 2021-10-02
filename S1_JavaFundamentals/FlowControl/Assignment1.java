import java.util.Scanner;

class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        if(i>0){
            System.out.println("Positive");
        }
        else if(i<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
