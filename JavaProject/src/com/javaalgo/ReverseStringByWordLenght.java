package com.javaalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringByWordLenght {

	public static void main(String[] args) {
		String s;
		String separateWord[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=br.readLine();
			separateWord=s.split(" ");
			s=s.replaceAll("\\s+","");
			StringBuilder str=new StringBuilder(s);
			str=str.reverse();
			System.out.println("string reverse is"+str);
			String sub="";
		
			int start=0;
			int end=0;
			for(int i=0;i<separateWord.length;i++){
				
				//System.out.println(separateWord[i]);
				end=end+separateWord[i].length();
				String substring=str.substring(start,end);
				System.out.println("subtrsing is "+substring);
				sub=sub+substring+" ";
				
				start=start+separateWord[i].length();
				
				
			}
			System.out.println("output String is "+sub);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
