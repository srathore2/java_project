package com.collectionDemo;

public class OverrideEquals {
	

	public static void main(String[] args) {
		Moof m1=new Moof(10, "satya");
		Moof m2=new Moof(10, "satya");
		if(m1.equals(m2)){
			System.out.println("executed");
		}else{
		System.out.println("not executed");
		}
	}

}

class Moof{
	int x;
	String y;
	public Moof(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	/*public boolean equals(Object o){
		Moof s=(Moof) o;
		if(s.x==this.x && s.y==this.y){
			return true;
		}else{
			return false;
		}
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moof other = (Moof) obj;
		if (x != other.x)
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	
	
	
}