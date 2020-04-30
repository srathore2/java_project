package com.linkedlist;

public class InsertionInSortedList {

	public static ListNode insert(ListNode head,ListNode nodetoisert){
		
		if(head==null){
			return nodetoisert;
		}
		ListNode currentNode=head;
		ListNode previous=new ListNode(0);
		while(currentNode!=null&&currentNode.getData()<nodetoisert.getData()){
			
			previous=currentNode;
			currentNode=currentNode.getNext();
		}
		if(nodetoisert.getData()<=head.getData()){
			nodetoisert.setNext(head);
			head=nodetoisert;
		}else{
		previous.setNext(nodetoisert);
		nodetoisert.setNext(currentNode);
		}
	return head;
	}
	public static void traverse(ListNode head){
		while(head!=null){
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
	
	
	public static void main(String[] args) {
		
		ListNode l1=new ListNode(10);
		ListNode l2=new ListNode(18);
		ListNode l3=new ListNode(11);
		ListNode l4=new ListNode(7);
		ListNode l5=new ListNode(100);
		
		ListNode headnode=null;
		headnode=InsertionInSortedList.insert(headnode,l1);
		headnode=InsertionInSortedList.insert(headnode,l2);
		headnode=InsertionInSortedList.insert(headnode,l3);
		headnode=InsertionInSortedList.insert(headnode,l4);
		headnode=InsertionInSortedList.insert(headnode,l5);
		
		System.out.println("list is ");
		InsertionInSortedList.traverse(headnode);
	}

}
