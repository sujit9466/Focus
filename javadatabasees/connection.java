package javadatabasees;
import java.sql.*;
public class connection {

	
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/mysqldatabase","root","1234");
		Statement st=con.createStatement();
		System.out.println("insert record");

		String sql="insert into dept(Id,name)"
				+ "values(111,'ashu')";
st.executeUpdate(sql);

		
		
		
	} catch (Exception e) {
		System.out.println();
	}
}
	
	
}
