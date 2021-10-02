import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment4 {
    public static void main(String[] args) {
        HashMap<String,Integer> ContactList = new HashMap<String,Integer>();

        ContactList.put("Aakash", 99999999);
        ContactList.put("Vinay", 98999899);
        ContactList.put("Varun", 87008800);

        //a) Check if particular key exists

        if(ContactList.containsKey("Aakash")){
            System.out.println("Aakash is present in the list");
        }
        
        //b) Check if particular value exists
        
        Set<Entry<String,Integer>> set = ContactList.entrySet();
        Iterator<Entry<String,Integer>> itr = set.iterator();

        while(itr.hasNext()){
            if(itr.next().getValue() == 99999999){
                System.out.println("99999999 value exist");
                break;
            }
        }
    }
}
