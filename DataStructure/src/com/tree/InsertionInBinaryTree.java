package com.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InsertionInBinaryTree {

	public static BinaryTreeNode insertInBinaryTree(BinaryTreeNode root, BinaryTreeNode newNode) {
		LLQueue q = new LLQueue();
		BinaryTreeNode temp = null;
		if (newNode != null) {
			newNode.setLeft(null);
			newNode.setRight(null);
		}
		if (root == null) {
			System.out.println("inside");
			root = newNode;
			return root;
		}

		q.enQueue(root);
		while (!q.isEmpty()) {
			temp = q.deQueue();
			if (temp.getLeft() != null) {
				q.enQueue(temp.getLeft());
			} else {
				temp.setLeft(newNode);
				q.deleteQueue();
				return root;
			}
			if (temp.getRight() != null) {
				q.enQueue(temp.getRight());
			} else {
				temp.setRight(newNode);
				q.deleteQueue();
				return root;
			}

		}
		q.deleteQueue();
		return root;
	}

	public static BinaryTreeNode insertInBinaryTree1(BinaryTreeNode root, BinaryTreeNode newNode) {

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp = null;
		if (newNode != null) {
			newNode.setLeft(null);
			newNode.setRight(null);
		}
		if (root == null) {
			System.out.println("inside");
			root = newNode;
			return root;
		}

		q.add(root);
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			} else {
				temp.setLeft(newNode);
				q.clear();
				return root;
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			} else {
				temp.setRight(newNode);
				q.clear();
				return root;
			}

		}
		q.clear();
		return root;
	}

	public static BinaryTreeNode insertBinaryTree() {
		BinaryTreeNode root = null;
		BinaryTreeNode b1 = new BinaryTreeNode(1);
		BinaryTreeNode b2 = new BinaryTreeNode(2);
		BinaryTreeNode b3 = new BinaryTreeNode(3);
		BinaryTreeNode b4 = new BinaryTreeNode(4);
		BinaryTreeNode b5 = new BinaryTreeNode(5);
		BinaryTreeNode b6 = new BinaryTreeNode(6);
		BinaryTreeNode b7 = new BinaryTreeNode(7);
		BinaryTreeNode b8 = new BinaryTreeNode(8);
		BinaryTreeNode b9 = new BinaryTreeNode(9);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b1);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b2);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b3);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b4);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b5);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b6);
//		root=InsertionInBinaryTree.insertInBinaryTree(root,b7);

		root = InsertionInBinaryTree.insertInBinaryTree1(root, b1);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b2);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b3);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b4);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b5);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b6);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b7);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b8);
		root = InsertionInBinaryTree.insertInBinaryTree1(root, b9);

		return root;
	}
}
