package com.array;

public class Test2 {

	public static void main(String[] args) {

		int a[]={8,2,4,5,1,6,0,3,2};
		
		for(int i=0;i< a.length;i++){
			
			int pivot=i;
			int n1=-1;
			int n2=-1;
			int index1=0;
			int index2=0;
			boolean flag=true;
			for(int j=pivot-1;j>=0&&flag;j--){
				
				if(a[j]<a[pivot]){
					n1=a[j];
					flag=false;
				}
				index1=pivot-j;
			}
			flag=true;
           for(int j=pivot+1;j<a.length&&flag;j++){
				
				if(a[j]<a[pivot]){
					n2=a[j];
					flag=false;
				}
				index2=j-pivot;
			}
           if(n1==-1 && n2==-1){
        	   System.out.print(-1+" ");
           }else if(n1==-1 && n2!=-1){
        	   System.out.print(n2+" ");
           }else if(n1!=-1 && n2==-1){
        	   System.out.print(n1+" ");
           }else if(n1!=-1 && n2!=-1){
        	   
        	   if(index1==index2){
        		   if(n1<n2){
        			   System.out.print(n1+" ");
            	   }else{
            		   System.out.print(n2+" ");
            	   }
        	   } else if(index1<index2){
        		   System.out.print(n1+" ");
        	   }else{
        		   System.out.print(n2+" ");
        	   }
           }


		}
	}

}
