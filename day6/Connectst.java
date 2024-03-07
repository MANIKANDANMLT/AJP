import java.sql.*;
public class Connectst {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		String username = "root";
		String password ="";
		try {
			Class.forName("com.sql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connected");
			con.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("not connected");
	
		}

	}

}
