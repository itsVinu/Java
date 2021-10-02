import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Assignment3 {

    public static void iterateTreeSet(TreeSet<String> tree){
        Iterator i = tree.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void checkString(TreeSet<String> tree,String q){
        boolean result = false;

        Iterator i = tree.iterator();

        while(i.hasNext()){
            if(i.next().equals(q)){
                result = true;
                break;
            }
        }

        if(result){
            System.out.println(q+" exists");
        }
        else{
            System.out.println(q+" does not exist");
        }
    }

    public static void reverseTreeSet(TreeSet<String>tree){
        Iterator i = tree.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        t.add("Varun Gupta");
        t.add("Aakash");
        t.add("Vinay");
        t.add("Megha");

        iterateTreeSet(t);
        checkString(t, "Aakash");
        reverseTreeSet(t);
    }
}
