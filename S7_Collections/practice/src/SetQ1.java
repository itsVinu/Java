import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetQ1 {
    HashSet<String> set = new HashSet<>();

    // public HashSet<String> saveCountryName(String country){
    //     set.add(country);
    //     return set;
    // }
    // public String getCountry(String countryName){
    //     Iterator<String> itr = set.iterator();

    //     while(itr.hasNext()){
    //         if(itr.next().equals(countryName)){
    //             return countryName;
    //         }
    //     }
    //     return null;
    // }

    public static void main(String[] args) {
        // SetQ1 obj = new SetQ1();

        TreeSet<String> name = new TreeSet<>();

        name.add("India");
        name.add("USA");
        name.add("Germany");
        name.add("Russia");
        name.add("Canada");

        Iterator<String> itr = name.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // for(int i=name.size()-1;i>=0;i--){
        //     System.out.println(name.);
        // }
    }
}
