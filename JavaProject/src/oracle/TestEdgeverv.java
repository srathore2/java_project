package oracle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestEdgeverv {

	public static void main(String[] args) {
		int r=2;
		int rem;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		Integer []array=new Integer[n];
		Integer []B=new Integer[n];
		Set<Integer> b=new HashSet<Integer>();
		
		for(int i=0;i<n;i++){
			array[i]=s.nextInt();
		}
		
		
		for(int j=2;j>0;j++){
			b.add(-1);
			for(int i=0;i<n;i++){
				/*if(b.contains(array[i]%j)){
					b.clear();
					i=n+1;
				}
				else{
					b.add(array[i]%j);
			
				}*/
				b.add(array[i]%j);
			}
			if(b.size()==n+1){
				System.out.println("j= "+j);
				break;
			}
			b.clear();
			
		}
	
		//System.out.println();
			

	

}
}
