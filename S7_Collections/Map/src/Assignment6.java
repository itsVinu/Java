import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment6 {
    Hashtable<String, String> M1 = new Hashtable<String, String>();

	public Hashtable<String, String> saveCountryCapitals(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public Hashtable<String, String> swapKeyAndValue() {
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}

    public static void main(String[] args) {
        Assignment6 obj = new Assignment6();

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

        Hashtable<String,String> M2 = obj.swapKeyAndValue();
        System.out.println(M2);

        System.out.println(obj.toArrayList());
    }
}
