package com.tree;

public class InsertionInBinaryTree {

	public static BinaryTreeNode insertInBinaryTree(BinaryTreeNode root,BinaryTreeNode newNode){
		LLQueue q=new LLQueue();
		BinaryTreeNode temp=null;
	//	BinaryTreeNode newNode=new BinaryTreeNode(data);
		if(newNode!=null){
		newNode.setLeft(null);
		newNode.setRight(null);
		}
		/*if(newNode==null){
			System.out.println("memory error");
			return;
		}*/
		if(root==null){
			System.out.println("inside");
			root=newNode;
			return root;
		}
		
		q.enQueue(root);
		while(!q.isEmpty()){
			temp=q.deQueue();
			if(temp.getLeft()!=null){
				q.enQueue(temp.getLeft());
			}else{
				temp.setLeft(newNode);
				q.deleteQueue();
				return root;
			}
			if(temp.getRight()!=null){
				q.enQueue(temp.getRight());
			}else{
				temp.setRight(newNode);
				q.deleteQueue();
				return root;
			}

		}
		q.deleteQueue();
		return root;
	}
}
