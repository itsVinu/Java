import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Demo1 {

    public String stringConcat(String str1,String str2){
        return str1.concat(str2);
    }

    @Test
    public void testStringConcat(){
        assertEquals("AakashGupta", stringConcat("Aakash", "Gupta"));
        System.out.println("Demo1 success");
    }
}
