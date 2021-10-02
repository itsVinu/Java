import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Assignment5 {
    TreeMap<String,String> map = new TreeMap<String,String>();

    public TreeMap<String,String> saveCountryCapitals(String countryName,String capital){
        map.put(countryName, capital);
        return map;
    }

    public String getCapital(String countryName){
        return map.get(countryName);
    }
    public String getCountry(String capitalName){
        Set<Entry<String,String>> set = map.entrySet();
        Iterator<Entry<String,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> m = itr.next();
            if(m.getValue().equals(capitalName)){
                return m.getKey();
            }
        }
        return null;
    }
    public TreeMap<String,String> swapKeyAndValue(){
        TreeMap<String,String> M2 = new TreeMap<String,String>();

        Set<Entry<String,String>> set = map.entrySet();
        Iterator<Entry<String,String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> m = itr.next();
            M2.put(m.getValue(), m.getKey());
        }
        return M2;
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> arr = new ArrayList<String>();
        Set<Entry<String,String>> set = map.entrySet();
        Iterator<Entry<String,String>> i = set.iterator();

        while(i.hasNext()){
            Map.Entry<String,String> me = i.next();
            arr.add(me.getKey());
        }
        return arr;
    }


    public static void main(String[] args) {
        Assignment5 obj = new Assignment5();

        obj.saveCountryCapitals("India", "Delhi");
        obj.saveCountryCapitals("Japan", "Tokyo");
        obj.saveCountryCapitals("Pakistan", "Islamabad");
        obj.saveCountryCapitals("Australia", "Canberra");
        obj.saveCountryCapitals("England", "London");
        obj.saveCountryCapitals("France", "Paris");
        obj.saveCountryCapitals("Russia", "Moscow");

        System.out.println(obj.getCapital("Australia"));
        System.out.println(obj.getCapital("China"));

        System.out.println("Moscow is capital of: "+obj.getCountry("Moscow"));

        TreeMap<String,String> M2 = obj.swapKeyAndValue();
        System.out.println(M2);

        System.out.println(obj.toArrayList());
    }
}
