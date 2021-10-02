import java.util.Iterator;
import java.util.Vector;

public class Assignment7 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(1,"AAKASH","xyz@gmail.com","Male",3.5F));
		list.add(new Employee(2,"Varun","xyz@gmail.com","Male",3.5F));
		list.add(new Employee(3,"Megha","xyz@gmail.com","Female",3.5F));
		list.add(new Employee(4,"Vinay","xyz@gmail.com","Male",3.5F));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			it.next().getEmployeeDetails();
	}

}