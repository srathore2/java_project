package com.linkedlist;



public class NthNodeFromEnd {

	public static ListNode nthNodeFromEnd(ListNode head,int position){
		ListNode current=head;
		int count=0;
		while(head!=null){
			count++;
			if(position-count<0){
				current=current.getNext();
			}
			head=head.getNext();
		}
			if(count>=position){
				return current;
			}else
			{
				System.out.println("invalid position");
				return null;
			}
	
	}
	//lenght-nthnode+1 from begining 
	public static void main(String[] args) {
		ListNode headNode=null;
		LinkedListTest lt=new LinkedListTest();
		
		ListNode l1=new ListNode(10);
		ListNode l2=new ListNode(11);
		ListNode l3=new ListNode(12);
		ListNode l4=new ListNode(13);
		ListNode l5=new ListNode(14);
		headNode=lt.insert(headNode,l1,1);
		headNode=lt.insert(headNode,l2,2);
		headNode=lt.insert(headNode,l3,3);
		headNode=lt.insert(headNode,l4,4);
	    headNode=lt.insert(headNode,l5,5);
		ListNode node=nthNodeFromEnd(headNode,4);
		lt.traverse(headNode);
	/*	ListNode n=PairWiseSwap.pairSwap(headNode);
		System.out.println("after swaping data");
		lt.traverse(n);*/
		System.out.println("node from end is "+node.getData());

	}

}
