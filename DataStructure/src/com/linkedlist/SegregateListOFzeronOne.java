package com.linkedlist;

public class SegregateListOFzeronOne {
	public static ListNode segregate(ListNode head){
		ListNode head1=head;
		ListNode head2=head;
		ListNode secondstart=null;
		ListNode start=null;
		int count=0;
		int count1=0;
		while(head!=null){
			if(head.getData()==0){
				head1=head;
				if(count==0){
					 start=head;
				}
				
				head=head.getNext();
				head1=head1.getNext();
			}else{
				head1=head;
				if(count1==0){
					 secondstart=head;
				}
				head=head.getNext();
				head1=head1.getNext();
			}
		}
		head1=secondstart;
		return start;
	}

	public static void main(String[] args) {
		ListNode headNode=null;
		LinkedListTest lt=new LinkedListTest();
		
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(0);
		ListNode l4=new ListNode(0);
		ListNode l5=new ListNode(1);
		headNode=lt.insert(headNode,l1,1);
		headNode=lt.insert(headNode,l2,2);
		headNode=lt.insert(headNode,l3,3);
		headNode=lt.insert(headNode,l4,4);
		headNode=lt.insert(headNode,l5,5);
		
		headNode=SegregateListOFzeronOne.segregate(headNode);
		lt.traverse(headNode);
		
	}

}
