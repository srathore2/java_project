package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
			st=con.createStatement() ;
			String query="create Table stud(name varchar(20),id Integer ,Dept varchar(12))";
			boolean s=st.execute(query);
			System.out.println("table created"+s);
			
		}catch(Exception e){
			e.printStackTrace();
		

	}finally {
		try {
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
			
		}catch(SQLException e){
			e.printStackTrace();

		}
	}

}
}
