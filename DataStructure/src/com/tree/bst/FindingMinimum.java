package com.tree.bst;

public class FindingMinimum {
public static BinarySearchTreeNode findMinimumRec(BinarySearchTreeNode root){
	if(root==null) return null;
	else
		if(root.getLeft()==null) return root;
		else return findMinimumRec(root.getLeft());
}

public static BinarySearchTreeNode findMinimumIterative(BinarySearchTreeNode root){
	if(root==null) return null;
	while(root.getLeft()!=null)
		root=root.getLeft();
	return root;
}
public static BinarySearchTreeNode findMaxiimumRec(BinarySearchTreeNode root){
	if(root==null) return null;
	else
		if(root.getLeft()==null) return root;
		else return findMaxiimumRec(root.getRight());
}

public static BinarySearchTreeNode findMaximumIterative(BinarySearchTreeNode root){
	if(root==null) return null;
	while(root.getRight()!=null)
		root=root.getRight();
	return root;
}
}
