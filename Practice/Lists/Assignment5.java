import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Jan");
        list.addLast("Feb");
        list.addLast("Mar");
        list.add("Apr");

        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
