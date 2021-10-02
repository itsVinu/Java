import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment2 {
    public static void main(String[] args) {
        HashMap<String,String> obj = new HashMap<String,String>();

        obj.put("India", "Delhi");
        obj.put("Japan", "Tokyo");
        obj.put("Pakistan", "Islamabad");
        obj.put("Australia", "Canberra");
        obj.put("England", "London");

        Set<Entry<String,String>> set = obj.entrySet();
        Iterator<Entry<String,String>> itr = set.iterator();

        while(itr.hasNext()){
            if(itr.next().getKey().equals("Germany")){
                System.out.println("Key Germany exist");
                break;
            }
        }
        // OR
        if(obj.containsKey("India")){
            System.out.println("Key India exists");
        }

        // b) Check if a particular value exists or not 
        set = obj.entrySet();
        itr = set.iterator();

        while(itr.hasNext()){
            if(itr.next().getValue().equals("Tokyo")){
                System.out.println("Value Tokyo exists");
                break;
            }
        }
        // OR
        if(obj.containsValue("London")){
            System.out.println("Value London exists");
        }

        // c) Use Iterator to loop through the map key set
		set = obj.entrySet();
		itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			System.out.println(me);
		}
    }
}
