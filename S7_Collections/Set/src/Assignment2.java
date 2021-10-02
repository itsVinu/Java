import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Aakash");
        names.add("Vinay");
        names.add("Varun");
        names.add("Megha");

        Iterator i = names.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
