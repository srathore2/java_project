package com.tree;

import java.util.Map;
import java.util.TreeMap;

public class HigestVerticalSum {
	public static Map<Integer, Integer>map=new TreeMap<Integer, Integer>();
	
	public static void verticalSum(BinaryTreeNode root,int column) {
		if(root==null)
			return ;
		verticalSum(root.getLeft(), column-1);
		if(null!=map.get(column)) {
			map.put(column, map.get(column)+root.getData());
		}else {
			map.put(column,root.getData());
		}
		verticalSum(root.getRight(), column+1);
	}
	
public static void main(String[] args) {
		
		BinaryTreeNode root=InsertionInBinaryTree.insertBinaryTree();
		verticalSum(root, 0);
		System.out.println(map.toString());
	}

}
