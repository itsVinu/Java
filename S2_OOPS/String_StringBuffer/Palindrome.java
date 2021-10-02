import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int n = str.length();
        int i=0;

        for(i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not palindrome");
                break;
            }
        }
        if(i == n/2){
            System.out.println("Palindrome");
        }

        String rev = "";
        for(int j=str.length()-1;j>=0;j--){
            rev+=str.charAt(j);
        }
        System.out.println(rev);
    }
}