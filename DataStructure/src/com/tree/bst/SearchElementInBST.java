package com.tree.bst;

public class SearchElementInBST {

	
		
		public static BinarySearchTreeNode SearchInBstRecursive(BinarySearchTreeNode root,int data){
			if(root==null)
				return null;
			if(data<root.getData())
				return SearchInBstRecursive(root.getLeft(),data);
				else if(data>root.getData())
					return SearchInBstRecursive(root.getRight(), data);
			return root;
			
		}
		public static BinarySearchTreeNode SearchInBstIterative(BinarySearchTreeNode root,int data){
			if(root==null)
				return null;
			while(root!=null){
				if(data==root.getData())
					return root;
				else if(data<root.getData())
					root=root.getLeft();
				else root=root.getRight();
				
			}
			return root;
		}



}
