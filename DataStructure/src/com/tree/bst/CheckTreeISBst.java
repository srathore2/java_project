package com.tree.bst;

public class CheckTreeISBst {

	public static boolean checkBst(BinarySearchTreeNode root,int min,int max){
		if(root==null)
			return true;
	 if(root.getData()<min ||root.getData()>max)
		 return false;
	 return(checkBst(root.getLeft(), min, root.getData()) && checkBst(root.getRight(),root.getData(),max));
	}
	
	public static boolean checkBstUsingInordertra(BinarySearchTreeNode root,int prev){
		if(root==null)
			return true;
		if(!checkBstUsingInordertra(root.getLeft(), prev))
			return false;
		if(root.getData()<prev)
			return false;
		prev=root.getData();
		return checkBstUsingInordertra(root.getRight(), prev);
		
	}
}
