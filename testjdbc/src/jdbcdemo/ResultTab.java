package jdbcdemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultTab  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
			st=con.createStatement() ;
		    ResultSet rs=st.executeQuery("select *from stud");
			System.out.println("name\tid\tdept");
			while(rs.next()){
				String name=rs.getString("name");
				int id=rs.getInt("id");
				String dept=rs.getString("dept");
				System.out.println(name+"\t" +id+"\t"+dept);
			}
	
			
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