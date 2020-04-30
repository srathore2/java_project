package jdbcdemo;

import java.sql.*;
import java.util.Scanner;
public class Preps {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
Connection con=null;
Statement st=null;
Scanner s=new Scanner(System.in);
try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
       st=con.createStatement();
       PreparedStatement ps=con.prepareStatement("Create table stars(name varchar(20),salary integer,city varchar(20))");
    //ps.execute();
     /*ps=con.prepareStatement("Insert into stars values(?,?,?)");
       ps.setString(1, "Umangk");
       ps.setInt(2, 100000);
       ps.setString(3, "Bangalore");
       ps.executeUpdate();
       System.out.println("Succesfully inserted");
       System.out.println("Enter salary to be removed");
       int salary=s.nextInt();
       String sql="Delete from stars where salary=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1, salary);
       ps.executeUpdate();*/
    String sql1="Update stars Set name='Umang' where salary=?";
    ps=con.prepareStatement(sql1);
    ps.setInt(1, 1000);
    ps.executeUpdate();

} catch (Exception e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
}finally{
       try{
              if(con!=null)
              con.close();
              if(st!=null)
              st.close();
       }catch(SQLException e)
       {
       e.printStackTrace();
       }
}
       }

}

