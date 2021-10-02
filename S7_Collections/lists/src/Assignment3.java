import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3 {
    ArrayList<String> list ;

    public Assignment3(ArrayList<String> list){
        this.list = new ArrayList<String>();
        this.list = list;
    }

    public void printAll(){
        Iterator i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Aakash");
        list.add("Varun");
        list.add("Vinay");

        Assignment3 a1 = new Assignment3(list);

        a1.printAll();
    }
}
