import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("Octobor");
        list.add("November");
        list.add("December");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
