package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarchingCocroach {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int totallength = sc.nextInt();
		    int totalants = sc.nextInt();
		    List<Integer> position= new ArrayList<Integer>();
		    for(int i=0;i<totalants;i++){
		        position.add(sc.nextInt());
		    }
		    
		    int mintime=Integer.MIN_VALUE;
		    for(int i=0;i<totalants;i++){
		        if(Math.min(position.get(i),totallength-position.get(i))>mintime){
		            mintime=Math.min(position.get(i),totallength-position.get(i));
		        }
		    }
		    System.out.print(mintime+" ");
		    
		    int maxtime=Integer.MIN_VALUE;
		    for(int i=0;i<totalants;i++){
		        if(Math.max(position.get(i),totallength-position.get(i))>maxtime){
		            maxtime=Math.max(position.get(i),totallength-position.get(i));
		        }
		    }
		    System.out.print(maxtime+" ");
		}
	}


