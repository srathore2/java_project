package com.tree;

public class PreOrderTraversal {
	public static void preOrder(BinaryTreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public static void main(String[] args) {
		
		BinaryTreeNode root=null;
		BinaryTreeNode b1=new BinaryTreeNode(1);
		BinaryTreeNode b2=new BinaryTreeNode(2);
		BinaryTreeNode b3=new BinaryTreeNode(3);
		BinaryTreeNode b4=new BinaryTreeNode(4);
		BinaryTreeNode b5=new BinaryTreeNode(5);
		BinaryTreeNode b6=new BinaryTreeNode(6);
		BinaryTreeNode b7=new BinaryTreeNode(7);
		
		/*root=InsertionInBinaryTree.insertInBinaryTree(root,1);
		root=InsertionInBinaryTree.insertInBinaryTree(root,2);
		root=InsertionInBinaryTree.insertInBinaryTree(root,3);
		root=InsertionInBinaryTree.insertInBinaryTree(root,4);
		root=InsertionInBinaryTree.insertInBinaryTree(root,5);
		root=InsertionInBinaryTree.insertInBinaryTree(root,6);
		root=InsertionInBinaryTree.insertInBinaryTree(root,7);*/
		
	    root=InsertionInBinaryTree.insertInBinaryTree(root,b1);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b2);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b3);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b4);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b5);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b6);
		root=InsertionInBinaryTree.insertInBinaryTree(root,b7);
	    preOrder(root);
		
	}

}
