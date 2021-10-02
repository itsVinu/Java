public class Calculator {

     public Calculator(){
         
     }

    public static double powerInt(int num1, int num2){
        return Math.pow(num1,num2);
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }


    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.powerInt(3, 4));
        System.out.println(c1.powerDouble(3.0, 4));
    }
}
