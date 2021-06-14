package com.tree;

import java.util.concurrent.Delayed;

public class TreeRecursiveFunctions {
	
	
	public static int maximumUsingRecursion(BinaryTreeNode root) {
		int max=0;
		if(root!=null) {
			int rootval=root.getData();
			int left=maximumUsingRecursion(root.getLeft());
			int right=maximumUsingRecursion(root.getRight());
			if(left>right) {
				max=left;
			}else {
				max=right;
			}
			if(rootval>max) {
				max=rootval;
			}
		}
		return max;
	}
	
	public static boolean search(BinaryTreeNode root,int data) {
		if(root!=null) {
			int rootval=root.getData();
			if(rootval==data)
				return true;
			else {
				boolean left=search(root.getLeft(),data);	
				if(left) {
					return left;
				}else {
					return search(root.getRight(),data);	
				}
			}
		}
		return false;
	}
	public static int sizeOftree(BinaryTreeNode root) {
		if(root==null)
			return 0;
		return sizeOftree(root.getLeft())+1+sizeOftree(root.getRight());
	}
	//use post order traversal 
	public static void deleteTree(BinaryTreeNode root) {
		
		if(root==null)
			return ;
		deleteTree(root.getLeft());
		deleteTree(root.getRight());
		System.out.println("deleting .."+root.getData());
		root=null;
	}
	
	public static int heightOfTree(BinaryTreeNode root) {
		if(root==null)
			return 0;
		else {
			int leftHeight=heightOfTree(root.getLeft());
			int rightHeight=heightOfTree(root.getRight());
			if(leftHeight>rightHeight)
				return (leftHeight+1);
			else
				return (rightHeight+1);
		}
	}
	
	public static boolean identicalTree(BinaryTreeNode root1,BinaryTreeNode root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		return ((root1.getData()==root2.getData()&&identicalTree(root1.getLeft(), root2.getLeft()) && identicalTree(root1.getRight(), root2.getRight())));
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode root= InsertionInBinaryTree.insertBinaryTree();
		BinaryTreeNode root2= InsertionInBinaryTree.insertBinaryTree();
		System.out.println("maximum :: "+maximumUsingRecursion(root));
		System.out.println("search element "+search(root, 9));
		System.out.println("size of tree ::"+sizeOftree(root));
		//deleteTree(root);
		//System.out.println("size of tree ::"+sizeOftree(root));
		System.out.println("height of tree ::"+heightOfTree(root));
		System.out.println("identical tree ::"+identicalTree(root, root2));
	}

}
