package com.linkedlist;

public class RotateList {

	
	
	public static ListNode roateList(ListNode head,int k){
		ListNode kth=null;
		ListNode current=head;
		int count=1;
		if(k==0)
			return head;
		while(current!=null && count<k){
			current=current.getNext();
			count++;
		}
		if(current==null){
			return head;
		}
		kth=current;
		
		
		while(current.getNext()!=null){
		
        current=current.getNext();			
		}
		
		current.setNext(head);
		head=kth.getNext();
		kth.setNext(null);
	return head;
	}
	public static void main(String[] args) {
		ListNode headNode=null;
		LinkedListTest lt=new LinkedListTest();
		Reverse r=new Reverse();
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
		
		headNode=RotateList.roateList(headNode,3);
		System.out.println("rotate list from 2");
		lt.traverse(headNode);
 
	}
}
