package com.linkedlist;

public class ReverAlternateOrder {
	public static ListNode makeReversefromHalf(ListNode head){
		boolean flag=true;
		int count =1;
		
		ListNode slow=head;
		ListNode fast=head;
		if(head!=null){
			while(fast.getNext()!=null && fast.getNext().getNext()!=null){
				count++;
				fast=fast.getNext().getNext();
				slow=slow.getNext();
			}
		}
		if(count%2==0){
			slow=slow.getNext();
		}
		ListNode node1=new Reverse().reverse(slow);
		
		
		ListNode current=head;
		
		ListNode current1=node1;
		ListNode current1Next=node1;
		ListNode currentNext=head;
		while(currentNext!=null&&current1Next!=null){
			currentNext=current.getNext();
			current1Next=current1.getNext();
			
			current.setNext(current1);
			current1.setNext(currentNext);
			current=currentNext;
			current1=current1Next;
			//head=head.getNext();
					
			
			
		}
		return head;
		
	}
	
	
	public static void main(String[] args) {
		ListNode headNode=null;
		LinkedListTest lt=new LinkedListTest();
		
		ListNode l1=new ListNode(10);
		ListNode l2=new ListNode(11);
		ListNode l3=new ListNode(12);
		ListNode l4=new ListNode(13);
		ListNode l5=new ListNode(14);
		ListNode l6=new ListNode(15);
		headNode=lt.insert(headNode,l1,1);
		headNode=lt.insert(headNode,l2,2);
		headNode=lt.insert(headNode,l3,3);
		headNode=lt.insert(headNode,l4,4);
		headNode=lt.insert(headNode,l5,5);
		headNode=lt.insert(headNode,l6,6);
		
		System.out.println("list is");
		lt.traverse(headNode);
		System.out.println("after process list is ");
		
		makeReversefromHalf(headNode);
		lt.traverse(headNode);
	}

}
