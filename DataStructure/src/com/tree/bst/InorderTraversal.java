package com.tree.bst;

public class InorderTraversal {
	public static void InOrder(BinarySearchTreeNode root){
		if(root!=null){
			
			InOrder(root.getLeft());
			System.out.println(root.getData());
			InOrder(root.getRight());
		}
	}
	
}
