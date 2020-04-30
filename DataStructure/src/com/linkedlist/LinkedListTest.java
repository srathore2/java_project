package com.linkedlist;

public class LinkedListTest {

	public int ListLenght(ListNode head){
		int length=0;
		ListNode currentNode=head;
		while(currentNode !=null){
			length++;
			currentNode=currentNode.getNext();
			
		}
		return length;
	}
	public void traverse(ListNode head){
		ListNode current=head;
		while(current !=null){
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	
	public ListNode insert(ListNode head,ListNode nodeToinsert,int position){
		if(head==null){
			return nodeToinsert;
		}
		int size=ListLenght(head);
		if(position>size+1||position<1){
			System.out.println("invalid position");
			return head;
		}
		if(position==1){
			nodeToinsert.setNext(head);
			return nodeToinsert;
		}else{
			ListNode previousNode=head;
			int count=1;
			while(count<position-1){
				previousNode=previousNode.getNext();
				count++;
			}
			ListNode currentNode=previousNode.getNext();
			nodeToinsert.setNext(currentNode);
			previousNode.setNext(nodeToinsert);
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
		ListNode l4=new ListNode(11);
		ListNode l5=new ListNode(10);
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
		
		//System.out.println(lt.ListLenght(headNode));
		/*System.out.println("1st list");
		lt.traverse(headNode);
		System.out.println("recursive lenht is"+LengthRecursive.recursiveLenthOFString(headNode));
		System.out.println("resverse of list is");
		 
		headNode=r.recursiveReverse(headNode);
		lt.traverse(headNode);
		*/
		System.out.println(MiddleInoneScane.palindraomCheck(headNode));
		
		//CountDuplicateUsingHashMap.countDuplicate(headNode);
		/*System.out.println("2nd list");
		lt.traverse(headNode2);
		System.out.println("merge list is ");*/
/* ListNode headNode3=MergeTwoSortedList.mergeTwoSortedList(headNode, headNode2);
 lt.traverse(headNode3);*/
 
/* ListNode headNode4=MergeTwoSortedListinReverse.mergeTwoSortedListinReverseOrde(headNode, headNode2);
 lt.traverse(headNode4);*/
		/*headNode=RotateList.roateList(headNode,3);
		System.out.println("rotate list from 2");
		lt.traverse(headNode);
 */
	}

}
