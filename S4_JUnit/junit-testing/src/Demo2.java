import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Demo2 {
    public boolean palindromeCheck(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    @Test
    public void testPalindromeCheck(){
        assertTrue(palindromeCheck("NITIN"));
        assertTrue(palindromeCheck("MALAYALAM"));
        assertTrue( palindromeCheck("MADAM"));
        assertFalse(palindromeCheck("VARUN"));
        System.out.println("Demo2 success");
    }
}
