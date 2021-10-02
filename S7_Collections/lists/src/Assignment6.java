import java.util.Iterator;
import java.util.Vector;

public class Assignment6 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();

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

        Iterator it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
    }
}
