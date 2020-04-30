package com.tree;



public class LLQueue {
	private LLNode frontNode;
	private LLNode rearNode;

	public LLQueue() {

		frontNode = null;
		rearNode = null;

	}

	public static LLQueue createQueue() {
		return new LLQueue();
	}

	public boolean isEmpty() {
		return (frontNode == null);
	}
public void enQueue(BinaryTreeNode data){
	LLNode newNode=new LLNode(data);
	if(rearNode!=null){
	    rearNode.setNext(newNode);
	}
	rearNode=newNode;
	if(frontNode==null){
		frontNode=rearNode;
	}
	
}
public BinaryTreeNode deQueue(){
	BinaryTreeNode  data=null;
	if(isEmpty()){
		System.out.println("empty queue");
	}else{
		data=frontNode.getBtnode();
		frontNode=frontNode.getNext();
	}
	return data;
}
public void deleteQueue(){
	frontNode=null;
	rearNode=null;
}

}
