import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Employee {

    public String findName(ArrayList<String> employees,String name){
        String result = "";
        if(employees.contains(name)){
            result = "FOUND";
        }
        else{
            result = "NOT FOUND";
        }
        return result;
    }

    @Test
    public void testName(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Aakash");
        arr.add("Varun");
        arr.add("Vinay");

        assertEquals("FOUND", findName(arr, "Aakash"));
        assertEquals("NOT FOUND",findName(arr, "Akash"));
        System.out.println("Employee success");
    }

}
