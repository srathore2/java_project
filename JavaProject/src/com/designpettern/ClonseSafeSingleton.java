package com.designpettern;

import java.io.Serializable;

public class ClonseSafeSingleton implements Cloneable,Serializable{
	public static ClonseSafeSingleton cloneinstance=null;
	private static Object mutex= new Object();
	private ClonseSafeSingleton(){
		if(ClonseSafeSingleton.cloneinstance !=null){
			throw new RuntimeException("object allready created");
		}
	}
	
	/*public static ClonseSafeSingleton getInstance(){
		if(cloneinstance==null){
			cloneinstance=new ClonseSafeSingleton();
			return cloneinstance;
		}else{
			return cloneinstance;	
		}
		
	}*/
	//thread safe singleton
	public static ClonseSafeSingleton getInstance(){
		if(cloneinstance==null){
			synchronized (mutex) {
				if(cloneinstance==null){
					cloneinstance=new ClonseSafeSingleton();
				}
			}
	 }
		return cloneinstance;

		
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {

        
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        // return super.clone();
    }
	public Object readResolve() {
        return ClonseSafeSingleton.getInstance(); // 
    }
public void show(){
	System.out.println("in show method");
}

	public static void main(String[] args) {
		ClonseSafeSingleton test1=ClonseSafeSingleton.getInstance();
		test1.show();
		try{
			ClonseSafeSingleton test2=(ClonseSafeSingleton) test1.clone();
			test2.show();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
