package com.linkedlist;

public class ReverseBlockofKblock {

	
	public static ListNode reverseblockofK(ListNode head,int k){
		ListNode nextnode=null;
		ListNode temp=null;
		ListNode current=head;
		head=current.getNext();
		int count=-1;
		while(current!=null){
			
			count++;
			if(count==k){
				count=0;
				temp.setNext(head);
				
			}
			temp=current;
			current=current.getNext();
			
			
			
			nextnode=current.getNext();
			current.setNext(nextnode.getNext());
			temp=current.getNext();
			nextnode.setNext(current);
			if(temp!=null&&temp.getNext()!=null){
				current.setNext(current.getNext().getNext());
			}
			current=temp;
		
			
		}
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
		headNode=ReverseBlockofKblock.reverseblockofK(headNode, 3);
		lt.traverse(headNode);
	}
}
