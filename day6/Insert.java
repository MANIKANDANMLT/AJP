import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Insert {
	public void insertdata() throws Exception{
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		String username = "root";
		String password ="YES";
		String query = "insert into students values(?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, "cs2035");
		pst.setString(2,"aaa");
		pst.setString(3, "l");
		String dob =  "2000-11-14";
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDateofBirth = obj.parse(dob);
		Date sqlDateofBirth = new Date(utilDateofBirth.getTime());
		pst.setDate(4, sqlDateofBirth);
		pst.setString(5, "female");	
		pst.setString(6, "aaa123@gmail.com");
		pst.setString(7, "65769863878");
		pst.executeUpdate();
		con.close();
		
	}
	public static void main(String[] args) throws Exception {
		Insert object = new Insert();
		object.insertdata();
		

	}

}
