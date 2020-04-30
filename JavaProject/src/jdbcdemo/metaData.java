package jdbcdemo;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class metaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;Statement st=null;
		
		try{
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");*/
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Employe", "root","admin");
			DatabaseMetaData dbmd=con.getMetaData();  
			  
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
			  
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Stud ");
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int noc=rsmd.getColumnCount();
			System.out.println(noc);
			for (int i = 1; i <= noc; i++) {
				System.out.println("coloumn metadata");
				System.out.println("coloumn number"+i);
				System.out.println("width "+rsmd.getColumnDisplaySize(i));
				System.out.println("title"+rsmd.getColumnLabel(i));
				System.out.println("cloumn name"+rsmd.getColumnName(i));
				System.out.println("sql type"+rsmd.getColumnType(i));
				System.out.println("sql type name" +rsmd.getColumnTypeName(i));
				System.out.println("cloumn class name"+rsmd.getColumnClassName(i));
				System.out.println("cloumn table name"+rsmd.getTableName(i));
				System.out.println("number of decimal degit"+rsmd.getPrecision(i));
				
					
			}
			
			
			
		
		}catch(Exception e){e.printStackTrace();}
		finally{
			try{
				if(st!=null){st.close();}
				if(con!=null){con.close();}
			}catch(Exception e){e.printStackTrace();}
		}
	}

}

