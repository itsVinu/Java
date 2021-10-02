import java.util.List;

public class Assignment4 {
    public static void main(String[] args) {
        List<Object> list = new MyArrayList<>();

        try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			// list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
    }    
}
