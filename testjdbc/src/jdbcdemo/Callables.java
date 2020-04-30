package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Callables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		CallableStatement cse=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
			


             cse=con.prepareCall("{call FINDGREATER(?,?,?)}");

             cse.setInt(1, 5895);

             cse.setInt(2, 99);

             cse.registerOutParameter(3, Types.INTEGER);

             cse.execute();
             System.out.println("greater "+ cse.getInt(3));



		}catch(Exception e){
			e.printStackTrace();
		

	}finally {
		try {
			
			if(con!=null)
				con.close();
			
		}catch(SQLException e){
			e.printStackTrace();

		}
	}
	}
}

		
