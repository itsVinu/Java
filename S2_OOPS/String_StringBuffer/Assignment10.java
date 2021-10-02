import java.util.Scanner;

class Assignment10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int n = s.nextInt();

        String str1 = str.substring(str.length()-n);
        str = str1;
        
        for(int i=1;i<n;i++){
            str = str.concat(str1);
        }
        System.out.println(str);
    }
}
