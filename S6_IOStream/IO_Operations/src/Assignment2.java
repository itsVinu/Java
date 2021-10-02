import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the source file name");
        String str1 = s.nextLine();

        System.out.println("Enter the target file name");
        String str2 = s.nextLine();

        File sourceFile = new File(str1);
        File targetFile = new File(str2);

        FileReader in = new FileReader(sourceFile);
        FileWriter out = new FileWriter(targetFile);

        int c;

        while((c=in.read())!=-1){
            out.write(c);
        }
        System.out.println("The file has been copied successfully");

        in.close();
        out.close();

    }
}
