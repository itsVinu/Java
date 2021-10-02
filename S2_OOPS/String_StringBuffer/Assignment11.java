import java.util.Scanner;

class Assignment11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        int i = a.indexOf(b);

        while(i!=-1){
            if(i-1>-1){
                if(b.length()+i<a.length()){
                    System.out.print(a.charAt(i-1)+""+a.charAt(b.length()+i));
                }
                else{
                    System.out.println(a.charAt(i-1));
                }
            }
            else{
                if(b.length()+i<a.length()){
                    System.out.print(a.charAt(b.length()+i));
                }
                else{
                    System.out.println(a.charAt(i-1));
                }
            }

            i = a.indexOf(b,i+1);
        }
    }
}
