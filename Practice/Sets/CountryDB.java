import java.util.HashSet;
import java.util.Iterator;

public class CountryDB{
    HashSet<String>H1 = new HashSet<String>();

    public HashSet<String> saveCountryNames(String CountryName){
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String countryName){
        Iterator i = H1.iterator();
        while(i.hasNext()){
            if(i.next().equals(countryName)){
                return countryName;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        CountryDB c1 = new CountryDB();

        c1.saveCountryNames("India");
        c1.saveCountryNames("Brazil");
        c1.saveCountryNames("Argentina");
        c1.saveCountryNames("Russia");
        c1.saveCountryNames("England");
        c1.saveCountryNames("Germany");

        System.out.println(c1.getCountry("Brazil"));
        System.out.println(c1.getCountry("China"));
    }
}