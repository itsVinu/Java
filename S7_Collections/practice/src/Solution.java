import java.util.HashMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        int i=0;
        for(;i<a.length();i++){
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }
            else{
                map.put(a.charAt(i),1);
            }
        }

        for(i=0;i<b.length();i++){
            if(map.containsKey(b.charAt(i)) && map.get(b.charAt(i))>0 ){
                map.put(b.charAt(i),map.get(b.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        if(i==a.length()){
            if(map.containsValue(1)){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        String a = "Hello";
        String b = "heluo";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
