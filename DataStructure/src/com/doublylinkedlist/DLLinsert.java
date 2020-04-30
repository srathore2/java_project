package com.doublylinkedlist;

public class DLLinsert {

	public DLLNode inert(DLLNode head,DLLNode nodetoinsert,int position){
		if(head==null)
			return nodetoinsert;
		int size=length(head);
		if(position>size+1&&position<1){
			System.out.println("invalid position");
			return head;
		}
		if(position==1){
			nodetoinsert.setNext(head);
			head.setPrevious(nodetoinsert);
			return nodetoinsert;
		}else{
			DLLNode previousNode=head;
			int count=1;
			while(count<position-1){
				previousNode=previousNode.getNext();
				count++;
				
			}
			DLLNode currentnode=previousNode.getNext();
			nodetoinsert.setNext(currentnode);
			if(currentnode!=null)
				currentnode.setPrevious(nodetoinsert);
			
				nodetoinsert.setPrevious(previousNode);
			    previousNode.setNext(nodetoinsert);
			
		
			
			return head;
		}
		
	}
	public int length(DLLNode head){
		int count=0;
		while(head!=null){
			count++;
			head=head.getNext();
		}
		return count ;
	}
	public void traverse(DLLNode head){
		while(head!=null){
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
}
