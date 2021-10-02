import java.util.Scanner;

class Assignment6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();
        String str2 = s.nextLine();

        if(str1.length() == str2.length() && str1.length()!=0){

        }
        else if(str1.length() < str2.length()){
            System.out.println(str1.concat(str2).concat(str1));
        }
        else{
            System.out.println(str2.concat(str1).concat(str2));
        }
    }
}