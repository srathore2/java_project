package oracle;

public class NestedStaticClass {
	public void show1(){
		System.out.println("outer show ");
	}
	class Nestwithoutstatic{
		private int x=10;
	  public void show(){
		  System.out.println("next"+x);
	  }
	}
public static class next1{
	private int z=1;
public void show(){
	System.out.println("z="+z);
}
}
}
class demo extends NestedStaticClass{
	public void show1(int x){
		
		System.out.println("overload show1"+x);
	}
	public static void main(String args[]){
		
		NestedStaticClass n=new NestedStaticClass();
		NestedStaticClass.Nestwithoutstatic n1=n.new Nestwithoutstatic();
		n1.show();
		NestedStaticClass.next1 n2=new NestedStaticClass.next1();
		n2.show();
		demo d=new demo();
		d.show1(10);
		
		
	}
}
