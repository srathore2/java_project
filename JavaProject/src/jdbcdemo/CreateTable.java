package jdbcdemo;




import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;Statement st=null;
		ResultSet rs=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			st=con.createStatement();
			
			DatabaseMetaData dbm=con.getMetaData();
		rs=dbm.getTables(null, null,"Stud11", null);
		System.out.println(rs.toString());
		boolean b =rs.next();
		System.out.println(b);
		if(b){
			String query="Create Table Stud11(name varchar(20),id Integer,Dept varchar(20))";
			boolean s=st.execute(query);
			System.out.println("Table created"+s);
		}else{
			System.out.println("table exists");
		}
		System.out.println("in while");
		
			
			
			}catch(Exception e){e.printStackTrace();}
		finally{
			try{
				if(st!=null){st.close();}
				if(con!=null){con.close();}
			}catch(Exception e){e.printStackTrace();}
		}
	}

}

