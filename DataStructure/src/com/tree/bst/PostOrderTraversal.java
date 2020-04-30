package com.tree.bst;

public class PostOrderTraversal {
	public static void PostOrder(BinarySearchTreeNode root){
		if(root!=null){
			
			PostOrder(root.getLeft());
			
			PostOrder(root.getRight());
			System.out.println(root.getData());
		}
	}
}
