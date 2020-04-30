package com.linkedlist;

public class Reverse {
	public ListNode reverse(ListNode head){
		ListNode currentNode=head;
		ListNode temp=null;
		while(currentNode !=null){
			currentNode=head.getNext();
			head.setNext(temp);
			temp=head;
			head=currentNode;
		}
		return temp;
		
	}
/*//Divide the list in 2 parts - first node and rest of the list.
	Recursively call reverse for the rest of the linked list.
	Link rest to first.
	Fix head pointer*/
	public ListNode recursiveReverse(ListNode head){
		
		ListNode rest;
		if(head==null)
		{
			//list does not exist
			return null;
		}
		//list with one element 
		if(head.getNext()==null){
			return head;
		}
		//recursive call on rest
		rest=recursiveReverse(head.getNext());
		//make first; link to the last node in the reversed rest.
		head.getNext().setNext(head);
		//since first is the new last..make its link NULL.
		head.setNext(null);
		//rest is head now
		return rest;
		
	}
}
