import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the file name");
        String str = s.nextLine();

        System.out.println("Enter the character to be counted");
        char x = s.nextLine().charAt(0);

        File file = new File(str);

        FileReader in = new FileReader(file);

        int c,count=0;
        while((c=in.read())!=-1){
            if(x == (char) c){
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
