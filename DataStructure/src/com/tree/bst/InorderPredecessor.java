package com.tree.bst;

public class InorderPredecessor {
	
	public static void predecessor(BinarySearchTreeNode root,BinarySearchTreeNode []pre,BinarySearchTreeNode[] suc,int key){
		if(root==null)
			return;
		if(root.getData()==key){
			if(root.getLeft()!=null){
				BinarySearchTreeNode temp=root.getLeft();
				while(temp.getRight()!=null){
					temp=temp.getRight();
					
				}
				pre[0]=temp;
			}
			if(root.getRight()!=null){
				BinarySearchTreeNode temp1=root.getRight();
				while(temp1.getLeft()!=null){
					temp1=temp1.getLeft();
				}
				suc[0]=temp1;
			}
			return;
			
		}
		if(root.getData()>key){
			suc[0]=root;
			predecessor(root.getLeft(),pre,suc,key);
		}
		else{
			pre[0]=root;
			predecessor(root.getRight(),pre,suc,key);
		}
		
	}
		

}
