import java.sql.*;
import java.io.*;

public class Imagesave {
	
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
			
			String s = "insert into images (pic) values (?)";
			
			// Create Statement
			
			PreparedStatement pstmt = con.prepareStatement(s);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\SAMYAK\\Desktop\\tree-736885__480.jpg");
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			
			
			System.out.println("inserted ...");
			
			con.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		

	}

}
