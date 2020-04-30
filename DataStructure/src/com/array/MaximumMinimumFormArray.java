package com.array;

public class MaximumMinimumFormArray {

	public static void main(String[] args) {
		int array[]={1,2,3,4,5,6,7};
		
		
		
		
		            //7,1,6,2,5,3,4
		for(int i=0,k=0;i<array.length-1;i=i+2){
           array[i]=array.length-k++;
           System.out.println(array[i]+"  "+i);
		}
		System.out.println("dfdgfgh");
		
		System.out.println("iodfjds");
		if(array.length%2==0){
			for(int i=1,k=1;i<array.length+1;i=i+2){ 
				array[i]=k++;
				System.out.println(array[i]+ "  "+i);
			}
		}else{
			for(int i=1,k=1;i<array.length;i=i+2){ 
				array[i]=k++;
				System.out.println(array[i]+ "  "+i);
			}
			array[array.length-1]=array.length/2+1;
		}
		System.out.println("output");
		for(int s=0;s<array.length;s++){
			System.out.println(array[s]);
		}
		
		
	}

}
