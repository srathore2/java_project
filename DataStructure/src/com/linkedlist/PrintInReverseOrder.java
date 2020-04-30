package com.linkedlist;

public class PrintInReverseOrder {
	
	public static void printinReverseOrder(ListNode head)
	{
		if(head==null)
			return ;
		else
			printinReverseOrder(head.getNext());
		System.out.print(" "+head.getData());
	}

}
