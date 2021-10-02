import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment1 {
    HashMap<String,String> M1 = new HashMap<String,String>();

    public HashMap<String,String> saveCountryCapitals(String CountryName ,String capital){
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName){
        return M1.get(CountryName);
    }

    public String getCountry(String capitalName){
        Set<Entry<String,String>> set = M1.entrySet();
        Iterator<Entry<String,String>> i = set.iterator();

        while(i.hasNext()){
            Map.Entry<String,String> me = i.next();

            if(me.getValue().equals(capitalName)){
                return me.getKey();
            }
        }
        return null;
    }

    public HashMap<String,String> swapKeyAndValue(){
        HashMap<String,String> M2 = new HashMap<String,String>();

        Set<Entry<String,String>> set = M1.entrySet();
        Iterator<Entry<String,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> map = itr.next();
            M2.put(map.getValue(), map.getKey());
        }
        
        return M2;
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> arr = new ArrayList<String>();
        Set<Entry<String,String>> set = M1.entrySet();
        Iterator<Entry<String,String>> i = set.iterator();

        while(i.hasNext()){
            Map.Entry<String,String> me = i.next();
            arr.add(me.getKey());
        }
        return arr;
    }

    public static void main(String[] args) {
        Assignment1 obj = new Assignment1();

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

        HashMap<String,String> M2 = obj.swapKeyAndValue();
        System.out.println(M2);

        ArrayList<String> arr = obj.toArrayList();
        System.out.println(arr);
    }
}
