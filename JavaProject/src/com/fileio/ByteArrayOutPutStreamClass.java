package com.fileio;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutPutStreamClass {

	
		
		 public static void main(String args[])throws Exception{  
			  FileOutputStream fout1=new FileOutputStream("D:\\f11.txt");  
			  FileOutputStream fout2=new FileOutputStream("D:\\f12.txt");  
			  
			  ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
			  String S="satya";
			  byte b[]=S.getBytes();
			  
			  bout.write(b);  
			  bout.writeTo(fout1);  
			  bout.writeTo(fout2);  
			  
			  bout.flush();  
			  bout.close();//has no effect  
			  System.out.println("success...");  
	}

}
