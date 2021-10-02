public class MathOperation {
    int [] arr = new int[5];

    public void createArray(String [] str) throws NumberFormatException {
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
    }
    public void displaySum() throws ArrayIndexOutOfBoundsException, ArithmeticException{
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);
    }
    public void average() throws ArrayIndexOutOfBoundsException,ArithmeticException{
        double avg=0.0;
        for(int i=0;i<5;i++){
            avg+=arr[i];
        }
        avg = avg/5.0;
        System.out.println("The average is: "+avg);
    }
    public static void main(String[] args) {
        try{
            MathOperation m = new MathOperation();
            m.createArray(args);
            m.displaySum();
            m.average();            
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
