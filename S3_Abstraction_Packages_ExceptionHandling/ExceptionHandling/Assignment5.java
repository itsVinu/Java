public class Assignment5 {
    public void divide(double a,double b) throws ArithmeticException{
        if(b == 0.0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        try{
            Assignment5 a = new Assignment5();
            a.divide(13.0, 3.0);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
