package TreeTestingEx;

import java.security.PublicKey;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.AbstractDocument.LeafElement;

import TreeTestingEx.BinaryTree.Node;
import TreeTestingEx.BinaryTreeEx.BinaryTree;
import TreeTestingEx.BinaryTreeEx.Nodes;

public class BinaryTreeEx {

	static class BinaryTree {
		static int idx = -1;

		public static Nodes buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}

			Nodes newNode = new Nodes(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
		
		public static int countNumOfnodes(Nodes root) {
			if (root == null) {
				return 0;
			}
			int leftnode = countNumOfnodes(root.left);
			int rightnode = countNumOfnodes(root.right);
			
			return leftnode+ rightnode+1;
		}
		
		public static int sumOfNodes(Nodes root) {
			if (root == null) {
				return 0;
			}
			int sumofleftnode = sumOfNodes(root.left);
			int sumofrightnode = sumOfNodes(root.right);
			
			return sumofleftnode+ sumofrightnode+ root.data;
		}
		
		public static int hightOfTree(Nodes root) {
			if (root == null) {
				return 0;
			}
			int lefthight = hightOfTree(root.left);
			int righthight = hightOfTree(root.right);
			
			return Math.max(lefthight, righthight)+1;
		}
		
		static class Pair{
			int diam ;
			int hight;
			
			public Pair(int diam, int hight){
				this.diam = diam;
				this.hight = hight;
			}
		}
		
		public static Pair getDiameter(Nodes root) {
			if (root == null) {
				return new Pair(0, 0);
			}
			
			Pair leftPair = getDiameter(root.left);
			Pair rightPair = getDiameter(root.right);
			
			int myhight = Math.max(leftPair.hight, rightPair.hight)+1;
			
			int diam1 = leftPair.diam;
			int diam2 = rightPair.diam;
			int diam3 = leftPair.hight + rightPair.hight +1;
			
			int mydiam = Math.max(Math.max(diam2, diam2), diam3);
			
			Pair pair = new Pair(mydiam,myhight);
			
			return pair;
			
			
			
		}

	}

	static class Nodes {
		int data;
		Nodes left;
		Nodes right;

		public Nodes(int data) {
			this.data = data;
		}
	}

	public static void PreOrderTraversal(Nodes rooNodes) {
		if (rooNodes == null) {
			return;
		}
		System.out.print(rooNodes.data + " ");
		PreOrderTraversal(rooNodes.left);
		PreOrderTraversal(rooNodes.right);

	}

	public static void InOrderTraversal(Nodes root) {
		if (root == null) {
			return;
		}
		InOrderTraversal(root.left);
		System.out.print(root.data + " ");
		InOrderTraversal(root.right);
	}

	public static void PrintLevel(Nodes root) {
		Queue<Nodes> queue = new LinkedList<>();
		if (root == null) {
			return;
		}
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			Nodes currentNode = queue.remove();
			if (currentNode == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				}
			} else {
				System.out.print(currentNode.data+" ");
				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}

			}
			
		}
		
		

	}
	
	public static Nodes insert(Nodes root, int val) {
		if (root == null) {
			root = new Nodes(val);
			return root;
		}
		
		if(root.data>val) {
			root.left = insert(root.left, val);
		}
		else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	
	public static Nodes deleteNode(Nodes root, int val) {
		if (root.data>val) {
			root.left = deleteNode(root.left, val);
		}
		else if(root.data<val) {
			root.right = deleteNode(root.right, val);
		}
		else {
			if (root.left == null && root.right ==null) {
				return null;
			}
			
			if (root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
			return root.left;
			}
			
		}
		return root;
	}
	
	static class Pair{
		int hd;
		Node node;
		
		public Pair(int hd, Node node) {
			super();
			this.hd = hd;
			this.node = node;
		}
		
		
	}
	
	 static ArrayList<Integer> topView(Node root)
	    {
	     Map<Integer,Integer> map =  new TreeMap<Integer,Integer>(); 
	     Queue<Pair> queue = new LinkedList<Pair>();
	     queue.add(new Pair(0, root));
	     
	     while (!queue.isEmpty()) {
	    	 Pair current = queue.poll();
			if (!map.containsKey(current.hd)) {
				map.put(current.hd, current.node.data);
			}
			
			if (current.node.left!=null) {
				queue.add(new Pair(current.hd-1, root.left));
			}
			else if (current.node.right!=null) {
				queue.add(new Pair(current.hd+1, root.right));
			}
		}
	     ArrayList<Integer> arrayList = new ArrayList<Integer>();
	     Set<Entry<Integer,Integer>> entrySet = map.entrySet();
	     
		for (Entry<Integer, Integer> entry : entrySet) {
			arrayList.add(entry.getValue());
		}
	     
	     return arrayList;
	    }

	public static void main(String[] args) {
		int arr[] = { 1,2,7,-1,-1, 5,3,-1,-1,2,-1,-1,4,8,-1,-1,-1,-1,-1,-1};
//		int arr[] = {2, 2 ,13, 7, 10, 1, 10, 5, 2, -1, 14, 5, 11,5, 5, 13};
		BinaryTree binaryTree = new BinaryTree();
		Nodes root = null;
		for (int i = 0; i < arr.length; i++) {
			root = insert(root, arr[i]);
		}
//		Nodes root = BinaryTree.buildTree(arr);
//		System.out.println(root.data);
//		PreOrderTraversal(root);
//		System.out.println();
//		InOrderTraversal(root);
//		System.out.println();
//		System.out.println("--------------------------------------------------------------------------");
//		PrintLevel(root);
//		System.out.println("---------------------------------------------------------------------------");
//		System.out.println(binaryTree.countNumOfnodes(root));
//		System.out.println(binaryTree.sumOfNodes(root));
//		System.out.println(binaryTree.hightOfTree(root));
//		System.out.println(binaryTree.getDiameter(root).diam);
		int[] test = {3,7,8,4,9};
		ArrayDeque<Integer>  queue= new ArrayDeque<Integer>();
		for (Integer integer : test) {
			queue.add(integer);
		}
		System.out.println(queue);
		System.out.println(queue.peekLast());
		queue.pollLast();
		System.out.println(queue);
//		System.out.println(queue.);
		
		
	}

}
