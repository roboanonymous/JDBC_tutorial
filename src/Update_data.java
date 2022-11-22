import java.sql.*;
import java.io.*;

public class Update_data {
	
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
			
			String s = "Update table1 set tName = ?, tCity = ? where tID = ?";
			
			// Create Statement
			
			PreparedStatement pstmt = con.prepareStatement(s);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name: ");
			String name = br.readLine();
			
			System.out.println("Enter City: ");
			String City = br.readLine();
			
			System.out.println("Enter Student Id: ");
			int id = Integer.parseInt(br.readLine());
			
			
			pstmt.setString(1, name);
			pstmt.setString(2, City);
			
			pstmt.setInt(3, id);
			
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
