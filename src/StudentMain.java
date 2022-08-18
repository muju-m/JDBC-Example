
import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of sid");
		s.setSid(sc.nextInt());
		System.out.println("Enter value of sname");
		s.setSname(sc.next());
		System.out.println("Enter value of semail");
		s.setSemail(sc.next());
		
		StudentDAO dao = new StudentDAO();
		int i = dao.insert(s);
		if(i>0) {
			System.out.println("insertion done");
		}
		else {
			System.out.println("insertion failed");
		}
		
		dao.retrive();
	}
}
