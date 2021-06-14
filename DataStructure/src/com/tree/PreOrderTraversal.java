package com.tree;

import java.util.Stack;

public class PreOrderTraversal {
	public static void preOrder(BinaryTreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	
	public static void nonRecursivePreOrder(BinaryTreeNode root) {
		if(root==null) {
			return ;
		}
		Stack<BinaryTreeNode>S=new Stack<BinaryTreeNode>();
		while(true) {
			while(root!=null) {
				System.out.println(root.getData());
				S.push(root);
				root=root.getLeft();
			}
			if(S.isEmpty())
				break;
			root=S.pop();
			root=root.getRight();
		}
		return ;
	}
	public static void main(String[] args) {
		
		BinaryTreeNode root=InsertionInBinaryTree.insertBinaryTree();
	    //preOrder(root);
		nonRecursivePreOrder(root);
		
	}

}
