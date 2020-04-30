package com.linkedlist;

public class DetectLoopInsingleList {
	
	
	
	
public static boolean detectLoop(ListNode head){
	boolean flag=false;
	ListNode slow=head;
	ListNode fast=head;
	if(head!=null){
		while(slow!=null&&fast!=null&&fast.getNext()!=null){
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			if(slow==fast){
				flag=true;
				break;
			}
		}
	}
	return flag;
	
}
public static void crateLoop(ListNode head,int pos){
	ListNode current=head;
	ListNode temp=head;
			int count =1;
	while(current.getNext()!=null){
		current=current.getNext();
	}
	while(count<=pos){
		temp=temp.getNext();
		count++;
	}
	current.setNext(temp);
	
}
public static void findstartOfLoop(ListNode head){
	boolean flag=false;
	ListNode slow=head;
	ListNode fast=head;
	ListNode temp=null;
	if(head!=null){
		while(slow!=null&&fast!=null&&fast.getNext()!=null){
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			if(slow==fast){
				flag=true;
				break;
			}
		}
	}
	
	int looplength=1;
	
	if(flag==true){
		slow=head;
		
		while(slow!=fast){
			temp=fast;
			slow=slow.getNext();
			fast=fast.getNext();
			
		}
		System.out.println("meet point"+slow.getData()+fast.getData());
		
	}
	
	while(slow!=temp){
		slow=slow.getNext();
		looplength++;
	}
	System.out.println("looplenth ="+looplength);
	System.out.println("start of loop "+fast.getData());
	
	//terminating loop
	temp.setNext(null);

	
	
}
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
		DetectLoopInsingleList.crateLoop(headNode,2);
		boolean f=DetectLoopInsingleList.detectLoop(headNode);
		System.out.println("loop cotain="+f);
		DetectLoopInsingleList.findstartOfLoop(headNode);
		lt.traverse(headNode);
		
	}

}
