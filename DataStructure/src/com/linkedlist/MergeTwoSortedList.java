package com.linkedlist;

public class MergeTwoSortedList {
	
	public static ListNode mergeTwoSortedList(ListNode head1,ListNode head2){
		
		
		ListNode dummy=new ListNode(0);
		ListNode head3=dummy;
		while(head1!=null && head2!=null){
			 if(head1.getData()<=head2.getData()){
				 
				 head3.setNext(head1);
				
				 head1=head1.getNext();
			 }else{
				 
				 head3.setNext(head2);
				 head2=head2.getNext();
			 }
			head3=head3.getNext();
		}
		while(head1!=null){
			
			 head3.setNext(head1);
				
			 head1=head1.getNext();
				head3=head3.getNext();
		}
		while(head2!=null){
			
			head3.setNext(head2);
			 head2=head2.getNext();
				head3=head3.getNext();
		}
			return dummy.getNext();
		
	}
	public static ListNode recursiveMerge(ListNode head1,ListNode head2){
		ListNode head3=null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		if(head1.getData()<=head2.getData()){
			head3=head1;
			head3.setNext(recursiveMerge(head1.getNext(),head2));
		}else{
			head3=head2;
			head3.setNext(recursiveMerge(head1, head2.getNext()));
		}
		
		return head3;
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
		//secondlist
		ListNode headNode2=null;
		ListNode ll1=new ListNode(10);
		ListNode ll2=new ListNode(11);
		ListNode ll3=new ListNode(12);
		headNode2=lt.insert(headNode2,ll1,1);
		headNode2=lt.insert(headNode2,ll2,2);
		headNode2=lt.insert(headNode2,ll3,3);
		
		System.out.println("1st list");
		lt.traverse(headNode);
		System.out.println("2nd list");
		lt.traverse(headNode2);
		System.out.println("merge list is ");
		ListNode headNode3=MergeTwoSortedList.recursiveMerge(headNode, headNode2);
		 lt.traverse(headNode3);
	}
}
