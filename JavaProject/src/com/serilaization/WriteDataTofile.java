package com.serilaization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteDataTofile {

	public static void main(String[] args) {
		try{
	
		
		FileOutputStream fs=new FileOutputStream("D:\\stud1.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		Student s1=new Student(10,"satya");
		Student s2=new Student(11,"satyar");
		os.writeObject(s1);
		os.writeObject(s2);
		System.out.println("successfully written");
		FileInputStream fn=new FileInputStream("D:\\stud1.txt");
		ObjectInputStream oin=new ObjectInputStream(fn);
		Object o1=oin.readObject();
		Object o2=oin.readObject();
		Student s3=(Student) o1;
		Student s4=(Student) o2;
		System.out.println(s3);
		System.out.println(s4);
	
		
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}

}

 class Student implements Serializable{
	int  id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}