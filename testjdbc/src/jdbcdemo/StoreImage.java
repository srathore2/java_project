package jdbcdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import java.sql.PreparedStatement;

public class StoreImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Employe", "root","admin");
			
		/*	java.sql.PreparedStatement ps=con.prepareStatement("insert into image values(?,?)");  
			ps.setString(1,"satya");
			FileInputStream fin=new FileInputStream("E:\\image\\1.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			*/
			//retrive image
			PreparedStatement ps=con.prepareStatement("select * from image");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("E:\\sonoo.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			}
		}catch(Exception e) {
				System.out.println(e);// TODO: handle exception
			}
		}
}
		

	
		
	

	


