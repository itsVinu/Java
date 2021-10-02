public class Kotk extends GeneralBank{
    public double getFixedInt(){
        return 9;
    }
    public double getSavingsInt(){
        return 6;
    }

    public static void main(String[] args) {
        ICICI k = new ICICI();
        System.out.println(k.getFixedInt());
        System.out.println(k.getSavingsInt());
    }
}
