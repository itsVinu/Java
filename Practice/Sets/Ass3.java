import java.util.Iterator;
import java.util.TreeSet;

public class Ass3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("Akansha");
        set.add("Aakash");
        set.add("Vinay");
        set.add("Varun");

        Iterator i = set.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
        i = set.iterator();
        boolean result = false;

        while(i.hasNext()){
            if(i.next().equals("Varun")){
                result = true;
                break;
            }
        }
        if(result){
            System.out.println("Varun exists");
        }
        else{
            System.out.println("Varun does not exist");
        }
    }
}
