package com.tp.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();

		// Emp e1 = new Emp(111,"Tej","Pratap");
		list.add(new Emp(111, "Tej", "Pratap",new Address(12,"MG Road","Bangalore")));
		list.add(new Emp(112, "Ravi", "Singh",new Address(11,"Lake road","Bhopal")));
		//list.add(new Emp(113,"Manoj","Singh"));
		
		Iterator<Emp> itr = list.iterator();
		while(itr.hasNext())
		{
			Emp e =itr.next();
			//System.out.println(e);
			System.out.println("Emp id: "+e.getId()+" Emp Name: "+e.getName()+" Emp Sname: "+e.getSname()+" steet no: "+e.getAdd().getStno());
		}
		
		for(Emp e : list)
		{
			System.out.println("Emp id: "+e.getId()+" Emp Name: "+e.getName()+" Emp Sname: "+e.getSname());
		}
		
	}

}
