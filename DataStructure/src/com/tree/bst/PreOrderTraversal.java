package com.tree.bst;

public class PreOrderTraversal {
	public static void preOrder(BinarySearchTreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

}
