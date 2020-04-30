package com.common;



public class Test {
	 static String mergeStrings(String a, String b) {

		    if (a == null || a.length() == 0) {
		            return b;
		        } else if (b == null || b.length() == 0) {
		            return a;
		        } else {
		            final int aLength = a.length();
		            final int bLength = b.length();
		            final StringBuilder merged = new StringBuilder(aLength + bLength);

		            for (int i = 0, j = 0; i < aLength && j < bLength; i++, j++) {
		                merged.append(a.charAt(i)).append(b.charAt(j));
		            }

		            if (aLength != bLength) {
		                if (aLength > bLength) {
		                    merged.append(a.substring(bLength));
		                } else {
		                    merged.append(b.substring(aLength));
		                }
		            }

		            return merged.toString();
		        }
		    }
		    
 public static void main(String[] args) {

	 String name=null;
	 name=mergeStrings("abc","def");
	 System.out.println(name);
}
}