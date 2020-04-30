package com.tp.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"abc"));
		empList.add(new Employee(2,"def"));
		empList.add(new Employee(2,"ghi"));
		empList.add(new Employee(6,"bbc"));
		empList.add(new Employee(3,"abc"));
		empList.add(new Employee(3,"ghi"));
		empList.add(new Employee(4,"abc"));
		empList.add(new Employee(5,"abc"));
		
		empList.add(new Employee(6,"abc"));
		empList.add(new Employee(6,"cbc"));
		empList.add(new Employee(6,"dbc"));
		
		CompOnId c = new CompOnId();
		//CompOnName n  = new CompOnName();
		Collections.sort(empList,c);
		System.out.println("empList="+empList);
		//Collections.sort(empList,n);
		//System.out.println("empList="+empList);

	}

}

class Employee
{
	Integer id ;
	String name;
	Employee(Integer id , String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "i="+id+" name="+name +"\n";
	}
}

class CompOnId  implements Comparator<Employee>
{
	
	public int compare(Employee e1 ,Employee e2)
	{
		 if(0== (e1.id.compareTo(e2.id))){
			 return e1.name.compareTo(e2.name); 
			 
		 }
		 else
		 {
			 return (e1.id.compareTo(e2.id));
		 }
		// return 0;
	}
}
/*class CompOnName  implements Comparator<Employee>
{
	
	public int compare(Employee e1 ,Employee e2)
	{
		return e1.name.compareTo(e2.name);
	}
}*/

/*class CompOnId  implements Comparator<Employee>
{
	
	public int compare(Employee e1 ,Employee e2)
	{
		 if(0== (e1.name.compareTo(e2.name))){
			 return e1.id.compareTo(e2.id); 
		 }
		 else{
			 return e1.name.compareTo(e2.name);
		 }
	}
}*/

/* else{
return e1.id.compareTo(e2.id);
}*/
