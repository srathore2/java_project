package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.SequenceInputStream;

public class ReadTwoFileInONEbySequence {

	public static void main(String args[])throws Exception{  
		  File f1=new File("D:\\t1.txt");
		   FileInputStream fin1=new FileInputStream(f1);  
		   FileInputStream fin2=new FileInputStream("D:\\t2.txt");
		  
		   FileOutputStream fout=new FileOutputStream("D:\\f3.txt");  
		  
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
		   int i;  
		   while((i=sis.read())!=-1)  
		   {  
		     fout.write((char)i);      
		   }  
		   sis.close();  
		   fout.close();    
		   fin1.close();    
		   fin2.close();  
		   System.out.println("success");
		  
		  }  

}
