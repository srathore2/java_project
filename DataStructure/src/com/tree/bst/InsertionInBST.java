package com.tree.bst;



public class InsertionInBST {
	public static BinarySearchTreeNode insertInBinarySearchTree(BinarySearchTreeNode root,BinarySearchTreeNode newNode){
		
		if(newNode!=null){
		newNode.setLeft(null);
		newNode.setRight(null);
		}
		
		if(root==null){
			System.out.println("inside");
			root=newNode;
			return root;
		}else{
			if(newNode.getData()<root.getData())
				root.setLeft(insertInBinarySearchTree(root.getLeft(),newNode));
			else if(newNode.getData()>root.getData())
				root.setRight(insertInBinarySearchTree(root.getRight(),newNode));
		}
		
		
		return root;
	}
}
