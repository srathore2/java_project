package com.tp.common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HmObjectasKey {
	public static void main(String[] args) {
		HashMap<Student, String> hm = new LinkedHashMap<Student, String>();
		hm.put(new Student(11, "TEJ"), "TEJ");
		hm.put(new Student(11, "VIVEK"), "SHARMA");
		hm.put(new Student(13, "MANOJ"), "MANOJ");
		hm.put(new Student(13, "MANOJ"), "MANOJ singh");
		System.out.println("===================");
		
		Set<Student> keys = hm.keySet();
		for (Student p : keys) {
			System.out.println(p + "==>" + hm.get(p));

			
		}
		System.out.println(hm.size());

	}
 
}
class Student{
    
    private int id;
    private String name;
     
    public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
     
	public int hashCode() {
		/*int hashcode = 0;
		hashcode = id * 20;
		hashcode += name.hashCode();
		System.out.println("In hashcode="+hashcode);*/
		return 545949594;
	}

	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student pp = (Student) obj;
			boolean b= (pp.name.equals(this.name) && pp.id == this.id);
			System.out.println(" in equals b="+b);
			return b;
			
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
     
  
}
// if hashcode is same for different-2 key and key is also same then it will override the value .
// otherwise it will add another element in linked list 
// hashcode diff no problem if hashcode same for two key then it will go for key matching if key also same then it will override value . and if key diff then it will add one more element in linked list.
// ??? what is use of to make object as key 

//why String, Integer and Long are favourites as map keys - they are immutable; once created, the hash code will never change anymore

//// System.out.println("Does key available? "+hm.containsKey(keys));