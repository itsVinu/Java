import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment6 {

    int m1;
    int m2;

    public void setM1(int marks1) throws NumberFormatException,InputMismatchException{
        m1 = marks1;
    }

    public void setM2(int marks2) throws NumberFormatException,InputMismatchException{
        m2 = marks2;
    }

    public void average() throws NumberFormatException, OutOfRangeException{
        if(m1<0 || m1>100 || m2<0 || m2>100){
            throw new OutOfRangeException("Marks out of range");
        }
        int avg = (m1+m2)/2;
        System.out.println("The average of two marks is: "+avg);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            Assignment6 a = new Assignment6();
            a.setM1(s.nextInt());
            a.setM2(s.nextInt());
            a.average();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
