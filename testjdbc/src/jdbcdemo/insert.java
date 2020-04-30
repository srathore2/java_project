package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Employe", "root","admin");
			st=con.createStatement() ;
		        Scanner sc =new Scanner(System.in);
			String name =sc.nextLine();
			int id=sc.nextInt();
			String dept=sc.next();
			String query="Insert into stud values('"+name+"',"+id+",'"+dept+"')";
			boolean s=st.execute(query);
			System.out.println("table created"+s);
			String q="select * from stud";
			ResultSet rs=st.executeQuery(q);
			while(rs.next()){
				System.out.println(rs.getString(1)+rs.getInt(2)+rs.getString(3));
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