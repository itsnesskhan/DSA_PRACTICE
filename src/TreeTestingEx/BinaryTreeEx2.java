package TreeTestingEx;

import TreeTestingEx.BinaryTreeEx.Nodes;

public class BinaryTreeEx2 {
	static int idx =-1;
	
	static class Nodes {
		int data;
		Nodes left;
		Nodes right;

		public Nodes(int data) {
			this.data = data;
		}
	}
	
	public Nodes buildTree(int[] arr) {
		idx++;
		if(arr[idx]==-1) {
			return null;
		}
		Nodes root = new Nodes(arr[idx]);
		root.left = buildTree(arr);
		root.right = buildTree(arr);
		
		return root; 
	}
	
	public static void InorderTraversal(Nodes root) {
		if (root== null) {
			return;
		}
		InorderTraversal(root.left);
		System.out.println(root.data);
		InorderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 2 ,13, 7, 10, 1, 10, 5, 2, -1, 14, 5, 11,5, 5, 13};
		BinaryTreeEx2 binaryTreeEx2 = new BinaryTreeEx2();
		Nodes root = binaryTreeEx2.buildTree(arr);
		System.out.println(root.data);
//		InorderTraversal(root);
	}

}
