package com.tree.bst;

public class BstTestmain {

	public static void main(String[] args) {
		BinarySearchTreeNode root=null;
		BinarySearchTreeNode b1=new BinarySearchTreeNode(4);
		BinarySearchTreeNode b2=new BinarySearchTreeNode(2);
		BinarySearchTreeNode b3=new BinarySearchTreeNode(3);
		BinarySearchTreeNode b4=new BinarySearchTreeNode(1);
		BinarySearchTreeNode b5=new BinarySearchTreeNode(6);
		BinarySearchTreeNode b6=new BinarySearchTreeNode(5);
		BinarySearchTreeNode b7=new BinarySearchTreeNode(7);
		
	    root=InsertionInBST.insertInBinarySearchTree(root,b1);
		root=InsertionInBST.insertInBinarySearchTree(root,b2);
		root=InsertionInBST.insertInBinarySearchTree(root,b3);
		root=InsertionInBST.insertInBinarySearchTree(root,b4);
		root=InsertionInBST.insertInBinarySearchTree(root,b5);
		root=InsertionInBST.insertInBinarySearchTree(root,b6);
		root=InsertionInBST.insertInBinarySearchTree(root,b7);
		//PreOrderTraversal.preOrder(root);
		//InorderTraversal.InOrder(root);
		//PostOrderTraversal.PostOrder(root);
	/*	BinarySearchTreeNode bstsearch=SearchElementInBST.SearchInBstIterative(root, 5);
		System.out.println("element found "+bstsearch.getData());
		bstsearch=SearchElementInBST.SearchInBstIterative(root, 4);
		System.out.println("element found "+bstsearch.getData());*/
		/*BinarySearchTreeNode bstsearch=FindingMinimum.findMaxiimumRec(root);
		System.out.println("element found "+bstsearch.getData());
		bstsearch=FindingMinimum.findMaximumIterative(root);
		System.out.println("element found "+bstsearch.getData());
		bstsearch=FindingMinimum.findMinimumIterative(root);
		
		System.out.println("element found "+bstsearch.getData());
		bstsearch=FindingMinimum.findMinimumRec(root);
		System.out.println("element found "+bstsearch.getData());*/
		//root=new DeletionInBinaryTree().deletionInBST(root, 4);
		//System.out.println("pre order traversal");
		//PreOrderTraversal.preOrder(root);
		System.out.println("inorder traversal of tree");
		InorderTraversal.InOrder(root);
		//System.out.println("traversal of dll");
		//BinarySearchTreeNode head=root;
		
		/*BSTToDllConversion bstroot=	new BSTToDllConversion();
		bstroot.BinaryTree2DoubleLinkedList(root);
		bstroot.showlist();*/
		
		
		//BinarySearchTreeNode[] head = new BinarySearchTreeNode[1];
		/*root=head[0];
		while(root!=null){
			System.out.println(root.getData());
			root=root.getRight();
			
		}*/
		
	/*	BinarySearchTreeNode bstsearch=FindingMinimum.findMaxiimumRec(root);
		int max=bstsearch.getData();
		
		
		bstsearch=FindingMinimum.findMinimumIterative(root);
		int min=bstsearch.getData();
		System.out.println("min="+min+"max="+max);
		boolean b=CheckTreeISBst.checkBst(root, min, max);
		System.out.println("tree is BSt="+b);
		b=CheckTreeISBst.checkBstUsingInordertra(root, min);
		System.out.println("inorder method tree="+b);*/
		
		//inoder pre and suc
		BinarySearchTreeNode head1[]=new BinarySearchTreeNode[1];
		BinarySearchTreeNode head2[]=new BinarySearchTreeNode[1];
		BinarySearchTreeNode pre;
		BinarySearchTreeNode suc;
		
		InorderPredecessor.predecessor(root,head1,head2,3);
		pre=head1[0];
		suc=head2[0];
		if(pre!=null){
			System.out.println("predessor"+pre.getData());
		}else{
			System.out.println("predecesor not exist");
		}
		if(suc!=null){
			System.out.println("succesor"+suc.getData());
		}else{
			System.out.println("succesor not esixt");
		}
		
		
		
		
		
	}

}
