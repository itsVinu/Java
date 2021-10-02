import java.util.Scanner;

class Assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char c1,c2;
        c1 = s.next().charAt(0);
        c2 = s.next().charAt(0);
        
        if(Character.compare(c1, c2)>0){   //c1>c2 also works
            System.out.println(c2+","+c1);
        }
        else{
            System.out.println(c1+","+c2);
        }
    }
}
