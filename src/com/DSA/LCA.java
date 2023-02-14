package com.DSA;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class LCA {
	public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
			int node3) {
		if (root == null) {
			return null;
		}
		if (root.data == node1 || root.data == node2 || root.data == node3) {
			return root;
		}
		
		BinaryTreeNode<Integer> lefTreeNode  = lcaOfThreeNodes(root.left, node1, node2, node3);
		BinaryTreeNode<Integer> righTreeNode = lcaOfThreeNodes(root.right, node1, node2, node3);
		
		if (lefTreeNode!= null && righTreeNode!= null) {
			return root;
			
		}
		else if (lefTreeNode==null) {
			return righTreeNode;
		}
		else {
			return lefTreeNode;
		}
	}
}
