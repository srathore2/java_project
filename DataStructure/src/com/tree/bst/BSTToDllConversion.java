package com.tree.bst;

public class BSTToDllConversion {
	
	/*BinarySearchTreeNode left=null;
	BinarySearchTreeNode right=null;
	BinarySearchTreeNode ltail=null;
	BinarySearchTreeNode rtail=null;
	public  BinarySearchTreeNode bstToDllConversion(
			BinarySearchTreeNode root, BinarySearchTreeNode Ltail) {
		
		if(root==null){
			ltail=null;
			return null;
		}else{
			ltail=root;
		}
		left=bstToDllConversion(root.getLeft(),ltail);
		right=bstToDllConversion(root.getRight(), rtail);
		root.setLeft(ltail);
		root.setRight(right);
		if(right==null){
			ltail=root;
		}else{
			right.setLeft(root);
			ltail=rtail;
		}
		if(left==null){
			return root;
		
		}else{
			ltail.setRight(root);
			return left;
		}
	
	  }
		
*/
	public BinarySearchTreeNode prev;
	public static BinarySearchTreeNode storeroot=null;

	public void BinaryTree2DoubleLinkedList(BinarySearchTreeNode root)
	{
	    // Base case
	    if (root == null) return ;

	    // Initialize previously visited node as NULL. This is
	    // static so that the same value is accessible in all recursive
	    // calls

	    // Recursively convert left subtree
	    BinaryTree2DoubleLinkedList(root.getLeft());

	    // Now convert this node
	    if (prev == null)
	    	storeroot = root;
	    else
	    {
	        root.setLeft(prev);
	        prev.setRight(root);
	    }
	    prev = root;

	    // Finally convert right subtree
	    BinaryTree2DoubleLinkedList(root.getRight());
	    
	}
	
	public void showlist(){
		while(storeroot!=null){
			System.out.println(storeroot.getData());
			storeroot=storeroot.getRight();
		}
	}
		
	
}
	

