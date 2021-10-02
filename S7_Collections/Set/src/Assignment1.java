import java.util.HashSet;
import java.util.Iterator;

public class Assignment1 {
    HashSet<String> H1 = new HashSet<String>();

    public HashSet<String> saveCountryNames(String CountryName){
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName){
        Iterator i = H1.iterator();

        while(i.hasNext()){
            if(i.next().equals(CountryName)){
                return CountryName;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment1 c = new Assignment1();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Brazil");
        c.saveCountryNames("Russia");
        c.saveCountryNames("England");
        c.saveCountryNames("Germany");

        System.out.println(c.getCountry("Germany"));
        System.out.println(c.getCountry("China"));
    }
}
