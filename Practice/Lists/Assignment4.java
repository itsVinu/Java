import java.util.List;

public class Assignment4 {
    public static void main(String[] args) {
        List<Object> list = new NumbersList<>();

        try{
            list.add(10);
            list.add(12.00);
            list.add(3.5F);
            // list.add("e");
            System.out.println(list);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
