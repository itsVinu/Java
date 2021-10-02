import java.util.Scanner;

class Assignment9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        int n1 = a.length();
        int n2 = b.length();
        int i=0;

        if(n1<n2){
            for(i=0;i<n1;i++){
                System.out.print(a.charAt(i)+""+b.charAt(i));
            }
            while(i<n2){
                System.out.print(b.charAt(i));
                i++;
            }
        }
        else{
            for(i=0;i<n2;i++){
                System.out.print(a.charAt(i)+""+b.charAt(i));
            }
            while(i<n1){
                System.out.print(a.charAt(i));
                i++;
            }
        }
        
    }
}
