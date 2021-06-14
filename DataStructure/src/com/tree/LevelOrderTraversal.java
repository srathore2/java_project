package com.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;



public class LevelOrderTraversal {

	public static void levelOrderTraversal(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return;
		}
		q.add(root);
		while (!q.isEmpty()) {
			temp = q.remove();
			System.out.println(temp.getData());
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
	}

	public static int  heightOfTree(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return 0;
		}
		q.add(root);
		q.add(null);
		int count = 0;
		while (!q.isEmpty()) {
			temp = q.remove();

			if (temp == null) {
				if (!q.isEmpty()) {
					q.add(null);
				}
				count++;
			} else {
				if (temp.getLeft() != null) {
					q.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					q.add(temp.getRight());

				}
			}

		}
		q.clear();
		return count;
	}

	
	public static void  reverseOrderLevel(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		Stack<BinaryTreeNode>S=new Stack<BinaryTreeNode>();
		if (root == null) {
			return;
		}
		q.add(root);
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			S.push(temp);
		}
		while(!S.isEmpty())
			System.out.println(S.pop().getData());
		q.clear();
	}
	
	public static int  maxELementInBinaryTree(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			System.out.println("root is null");
			return 0;
		}
		q.add(root);
		int max=root.getData();
		while (!q.isEmpty()) {
			temp = q.remove();
			if(temp.getData()>=max) {
				max=temp.getData();
			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}
		q.clear();
		return max;
	}
	public static int  size(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			System.out.println("root is null");
			return 0;
		}
		q.add(root);
		int count=0;
		while (!q.isEmpty()) {
			temp = q.remove();
			count++;
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}
		q.clear();
		return count;
	}
	
	
	public static BinaryTreeNode deepestNode(BinaryTreeNode root) {
		BinaryTreeNode temp=null;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			System.out.println("root is null");
			return null;
		}
		q.add(root);
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
		return temp;
	}
	
	public static int  countNoOfLeafNode(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return 0;
		}
		q.add(root);
		int count =0;
		while (!q.isEmpty()) {
			temp = q.remove();
			if(temp.getRight()==null && temp.getLeft()==null) {
				count++;
			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
		return count;
	}
	public static int  countNoOfFullNode(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return 0;
		}
		q.add(root);
		int count =0;
		while (!q.isEmpty()) {
			temp = q.remove();
			if(temp.getRight()!=null && temp.getLeft()!=null) {
				count++;
			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
		return count;
	}
	public static int  countNoOfHalfNode(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return 0;
		}
		q.add(root);
		int count =0;
		while (!q.isEmpty()) {
			temp = q.remove();
			if((temp.getRight()!=null && temp.getLeft()==null) || (temp.getRight()==null && temp.getLeft()!=null) ) {
				count++;
			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
		return count;
	}
	
	public static int  sumOfALLtreeNode(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return 0;
		}
		q.add(root);
		int sum =0;
		while (!q.isEmpty()) {
			temp = q.remove();
			sum=sum+temp.getData();
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());

			}
		}
		q.clear();
		return sum;
	}
	
	public static Map<Integer,Integer>  levelWithMaxSum(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return null;
		}
		q.add(root);
		q.add(null);
		int currentSum=0;
		int count=0;
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp == null) {
				if (!q.isEmpty()) {
					q.add(null);
				}
				count++;
				map.put(count, currentSum);
				currentSum=0;
				
			} else {
				currentSum=currentSum+temp.getData();
				if (temp.getLeft() != null) {
					q.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					q.add(temp.getRight());

				}
			}

		}
		q.clear();
		return map;
	}
	
	public static void zigZagTraversal(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if (root == null) {
			return ;
		}
		q.add(root);
		q.add(null);
	    boolean flag=false;
	    Stack<BinaryTreeNode>S=new Stack<BinaryTreeNode>();
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp == null) {
				if (!q.isEmpty()) {
					q.add(null);
				}
				if(flag==false) {
					flag=true;
				}else {
					flag=false;
					while(!S.isEmpty()) {
						System.out.print(S.pop().getData());
					}
				}
				
			} else {
				if(flag) {
					S.push(temp);
				}else {
					System.out.print(temp.getData());
				}
				if (temp.getLeft() != null) {
					q.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					q.add(temp.getRight());

				}
			}

		}
		q.clear();
	}
	public static void main(String[] args) {
		BinaryTreeNode root1 = InsertionInBinaryTree.insertBinaryTree();
		levelOrderTraversal(root1);
		System.out.println("level of tree ..."+heightOfTree(root1));
		System.out.println("reverese level order ");
		reverseOrderLevel(root1);
		System.out.println("max eleemnt in tree");
		System.out.println(maxELementInBinaryTree(root1));
		System.out.println("size of tree ");
		System.out.println(size(root1));
		System.out.println("depest node ");
		System.out.println(deepestNode(root1).getData());
		System.out.println("no of leaf nodes:");
		System.out.println(countNoOfLeafNode(root1));
		System.out.println("no of full node:");
		System.out.println(countNoOfFullNode(root1));
		System.out.println("no of half node ");
		System.out.println(countNoOfHalfNode(root1));
		System.out.println("sum of all tree node");
		System.out.println(sumOfALLtreeNode(root1));
		System.out.println("sum with level ");
		System.out.println(heightOfTree(root1));
		System.out.println(levelWithMaxSum(root1).toString());
		System.out.println("zig zag traverasl ");
		zigZagTraversal(root1);
		
	}
}
