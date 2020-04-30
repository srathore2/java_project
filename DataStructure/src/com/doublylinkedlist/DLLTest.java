package com.doublylinkedlist;

public class DLLTest {

	public static void main(String[] args) {
		DLLinsert in=new DLLinsert();
		DLLNode head=null;
		DLLNode d1=new DLLNode(10);
		DLLNode d2=new DLLNode(11);
		DLLNode d3=new DLLNode(12);
		DLLNode d4=new DLLNode(13);
		DLLNode d5=new DLLNode(14);
		head=in.inert(head,d1,1);
		head=in.inert(head,d2,2);
		head=in.inert(head,d3,3);
		head=in.inert(head,d4,4);
		head=in.inert(head,d5,3);
		System.out.println("list is ");
		in.traverse(head);
		System.out.println("lenght is"+in.length(head));
		
		
		

	}

}
