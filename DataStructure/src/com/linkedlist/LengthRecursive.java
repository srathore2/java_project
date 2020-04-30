package com.linkedlist;

public class LengthRecursive {
	
	public static int recursiveLenthOFString(ListNode head){
		ListNode current= head;
		if(head==null)
			return 0;
		else 
			return 1+recursiveLenthOFString(current.getNext());
		
	}
}
