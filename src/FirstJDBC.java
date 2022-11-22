import java.sql.*;
public class FirstJDBC {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "samyak123";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			// Create query
			
			String s = "Create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			// Create Statement
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(s);
			System.out.println("table created in database ...");
			
			con.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
