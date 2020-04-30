package com.tree;

public class LLNode {
	private BinaryTreeNode btnode;
	private LLNode next;
	
	public LLNode(BinaryTreeNode btnode) {
		super();
		this.btnode = btnode;
	}
	public BinaryTreeNode getBtnode() {
		return btnode;
	}
	public void setBtnode(BinaryTreeNode btnode) {
		this.btnode = btnode;
	}
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	

}
