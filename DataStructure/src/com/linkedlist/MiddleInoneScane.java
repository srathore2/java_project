package com.linkedlist;

public class MiddleInoneScane {
	
	public int Middle(ListNode head){
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
		System.out.println("mid position is  "+count);
		
		
		return slow.getData();
	}

	public static boolean palindraomCheck(ListNode head){
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
		System.out.println(count);
		System.out.println(slow.getNext().getData());
		ListNode node=new Reverse().reverse(slow);
		while(node!=null){
			if(head.getData()!=node.getData()){
				flag=false;
				break;
			}
			head=head.getNext();
			node=node.getNext();
		}
		return flag;
	}
}
