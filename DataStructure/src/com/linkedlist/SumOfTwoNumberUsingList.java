package com.linkedlist;

public class SumOfTwoNumberUsingList {

	ListNode head3=null;
public static ListNode AdditionoftwoList(ListNode head1,ListNode head2){
		int sum=0;
		int carry=0;
		
		
		ListNode dummy=new ListNode(0);
		ListNode head3=dummy;
		while(head1!=null && head2!=null){
			 sum=carry+head1.getData()+head2.getData();
			 if(sum>=10){
				 carry=sum/10;
				 sum=sum%10;
				 
			 }else{
				 carry=0;
			 }
			 ListNode newNode=new ListNode(sum);
			 head3.setNext(newNode);
			 
			head3=head3.getNext();
			head1=head1.getNext();
			head2=head2.getNext();
		}
		while(head1!=null){
			
			sum=carry+head1.getData();
			if(sum>=10){
				 carry=sum/10;
				 sum=sum%10;
				 
			 }else{
				 carry=0;
			 }
			 ListNode newNode=new ListNode(sum);
			 head3.setNext(newNode);

			 head1=head1.getNext();
				head3=head3.getNext();
		}
		while(head2!=null){
			sum=carry+head2.getData();
			if(sum>=10){
				 carry=sum/10;
				 sum=sum%10;
				 
			 }else{
				 carry=0;
			 }
			 ListNode newNode=new ListNode(sum);
			 head3.setNext(newNode);
			 head2=head2.getNext();
				head3=head3.getNext(); 
		}
		
		if(carry!=0){
			ListNode newNode=new ListNode(carry);
			 head3.setNext(newNode);
		}
		
			return dummy.getNext();
		
	}
public   int carry=0;
public   int  sum=0;
public   int  count=0;
public  ListNode Additionoftworecursive(ListNode head1,ListNode head2,int length){
	ListNode rest;
	
	if(head1==null)
		return null;
	else 
		rest=Additionoftworecursive(head1.getNext(),head2.getNext(),length);
	
	sum=carry+head1.getData()+head2.getData();
	count++;
	
	
	 if(sum>=10){
		 carry=sum/10;
		 sum=sum%10;
		 
	 }else{
		 carry=0;
	 }
	 
	 ListNode newnode=new ListNode(sum);
		newnode.setNext(rest);
		if(count==length){
			ListNode newnode1=new ListNode(carry);
			newnode1.setNext(newnode);
			return newnode1;
		}else{
			return newnode;
		}
}
	


}

