import java.sql.Connection;
import java.sql.DriverManager;

public class Assignment1{
    public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 
		try {
	  	 Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex) {
	   		System.out.println("Error: unable to load driver class!");
	   		System.exit(1);
		}
	      
        try{
            Connection conn = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
            conn.close();
        }
        catch(Exception e){
            System.out.println("Connection could  not be established");
            System.out.println(e);
        }   
    }
}