import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDAO {
	public int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con = DbUtil.getCon();
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
		
		Statement st =  con.createStatement();
		String sql ="insert into student values("+s.getSid()+","+"'"+s.getSname()+"'"+","+"'"+s.getSemail()+"')";
		int row=st.executeUpdate(sql);
		return row;
	}
	public void retrive() throws SQLException, ClassNotFoundException {
		Connection con = DbUtil.getCon();
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
		
		Statement st =  con.createStatement();
		String sql = "select * from student";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
		}
	}
}
