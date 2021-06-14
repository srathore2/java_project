package com.tree;

public class MirrorOfTree {

	public static BinaryTreeNode mirrorTree(BinaryTreeNode root) {
		BinaryTreeNode temp;
		if(root!=null) {
			mirrorTree(root.getLeft());
			mirrorTree(root.getRight());
			temp=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
		return root;
	}
	public static boolean verifyMirrorTree(BinaryTreeNode root1,BinaryTreeNode root2) {
		if(root1==null &&root2==null ) {
			return true;
		}
		if(root1==null || root2==null ) {
			return false;
		}
		if(root1.getData()!=root2.getData()) {
			return false;
		}else return (verifyMirrorTree(root1.getLeft(),root2.getRight()) && verifyMirrorTree(root1.getRight(), root2.getLeft()));
	}
	
public static void main(String[] args) {
		
		BinaryTreeNode root1=InsertionInBinaryTree.insertBinaryTree();
		BinaryTreeNode root2=InsertionInBinaryTree.insertBinaryTree();
		
		PreOrderTraversal.preOrder(root1);
		root1=mirrorTree(root1);
		System.out.println("mirror tree");
		PreOrderTraversal.preOrder(root1);
		System.out.println(verifyMirrorTree(root1,root2));
	}
}
