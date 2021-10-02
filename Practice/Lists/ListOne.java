import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOne{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Jan");
        list.add("Feb");
        list.add("Mar");
        list.add("Apr");
        list.add("May");

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        Iterator i = list.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}