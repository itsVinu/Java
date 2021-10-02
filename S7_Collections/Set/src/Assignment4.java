import java.util.Iterator;
import java.util.TreeSet;

public class Assignment4 {
    TreeSet<String> ts = new TreeSet<String>();

    public TreeSet<String> saveCountryNames(String CountryName){
        ts.add(CountryName);
        return ts;
    }

    public String getCountry(String CountryName){
        Iterator i = ts.iterator();
        while(i.hasNext()){
            if(i.next().equals(CountryName)){
                return CountryName;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment4 a = new Assignment4();

        a.saveCountryNames("India");
        a.saveCountryNames("USA");
        a.saveCountryNames("England");
        a.saveCountryNames("France");
        a.saveCountryNames("Germany");
        a.saveCountryNames("Russia");
        a.saveCountryNames("Italy");

        System.out.println(a.getCountry("France"));
        System.out.println(a.getCountry("Pakistan"));
    }
}
