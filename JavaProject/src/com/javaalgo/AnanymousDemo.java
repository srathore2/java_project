package com.javaalgo;

class Anon{
	String greet(){
		return "welcome in anony super class";
		
		
	}
	void poopy()
	{
		System.out.println("i m in poppy");
	}
}
class Bnon{
	Anon a1=new Anon(){
		String greet(){
			System.out.println("welcome in anonymous class");
		    ownmeth(10);
		    return "bye in annonymous";
		}
		void  ownmeth(int x){
			System.out.println("from own method "+x);
			
	         }
	
		
	};
	String m2()
	{
		System.out.println(" im in bannon methods");
		System.out.println(a1.greet());
		a1.poopy();
		System.out.println(new Anon().greet());
		return "work done from bannon";
		
	}
	
}
public class AnanymousDemo {

	public static void main(String[] args) {
		Bnon obj=new Bnon();
		System.out.println(obj.m2());
		System.out.println(obj.a1.greet());

	}

}
