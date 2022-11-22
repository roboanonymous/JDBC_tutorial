import java.sql.*;
import java.io.*;

public class Insert_data {
	
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
			
			String s = "insert into table1 (tName , tCity) values (?,?)";
			
			// Create Statement
			
			PreparedStatement pstmt = con.prepareStatement(s);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name: ");
			String name = br.readLine();
			
			System.out.println("Enter City: ");
			String City = br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, City);
			
			pstmt.executeUpdate();
			
			System.out.println("inserted ...");
			
			con.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}
}
