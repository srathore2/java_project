package com.serilaization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutPut {

	public static void main(String[] args) {
		try{
		File f=new File("D:\\satya.txt");
		FileOutputStream fs=new FileOutputStream(f);
		String s="satya is best player";
		fs.write(s.getBytes());
        FileInputStream fi=new FileInputStream(f);
        int i;
        while((i=fi.read())!=-1){
        	System.out.print((char) i);
        }
		
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
		

}
