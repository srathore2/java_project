package com.tree.bst;

public class DeletionInBinaryTree {
	public BinarySearchTreeNode temp=null;
	public BinarySearchTreeNode  deletionInBST(BinarySearchTreeNode root,int data){
		
		if(root==null){
			System.out.println("empty tree");
		}else if(data<root.getData())
			root.setLeft(deletionInBST(root.getLeft(),data));
			else if(data>root.getData())
				root.setRight(deletionInBST(root.getRight(), data));
			else{
				//eleemnt found
				if (root.getLeft() == null)
	                return root.getRight();
	            else if (root.getRight()== null)
	                return root.getLeft();
				//root.setData(FindingMinimum.findMinimumRec(root.getRight()).getData());
				//root.setRight(deletionInBST(root.getRight(),root.getData()));
				root.setData(FindingMinimum.findMaxiimumRec(root.getLeft()).getData());
				root.setLeft(deletionInBST(root.getLeft(),root.getData()));
			}
			return root;
		}
	


}


