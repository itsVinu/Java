public class Patient {
    private String name;
    private double height;
    private double weight;


    public Patient(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    public double computeBMI(){
        return weight/Math.pow(height, 2);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Aakash",1.7,63.0);

        System.out.println(p1.computeBMI());
    }
}
