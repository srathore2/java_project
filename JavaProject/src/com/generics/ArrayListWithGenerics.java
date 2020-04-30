package com.generics;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		ArrayList dogcat=new ArrayList();
		dogcat.add(new Cat(10));
		dogcat.add(new Dog(10));
		list.add(4);
		list.add(5);
		Inserter in =new Inserter();
		in.insert(list);
		int sum=0;
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			//sum=sum+itr.next();
		}
		System.out.println("sum"+sum);
	}

	@Override
	public String toString() {
		return "ArrayListWithGenerics [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
class Inserter{
	void insert(List list){
		list.add(new Integer(10));
		list.add(new String("satya"));
		list.add(new Double(1.20));
	}
}

class Dog extends ArrayListWithGenerics{
	int x;

	public Dog(int x) {
		super();
		this.x = x;
	}
}
class Cat extends ArrayListWithGenerics{
	
	int y;

	public Cat(int y) {
		super();
		this.y = y;
	}
	
}

//this is happening beause of java 5,compiler warning are not consider as compiler failure