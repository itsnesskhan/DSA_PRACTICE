package TreeTestingEx;

public class BinaryTree {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data) {
		root = insertResursive(root, data);
	}

	public Node insertResursive(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertResursive(root.left, data);

		} else if (data > root.data) {
			root.right = insertResursive(root.right, data);

		}

		return root;
	}

	public void preOrder() {
		preOrderRecusrive(root);
	}

	public void preOrderRecusrive(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderRecusrive(root.left);
			preOrderRecusrive(root.right);
		}

	}
	
	public void inOrder() {
		inOrderRecusrive(root);
	}

	public void inOrderRecusrive(Node root) {
		if (root != null) {
			inOrderRecusrive(root.left);
			System.out.print(root.data + " ");
			inOrderRecusrive(root.right);
		}

	}
	
	public void delete(int data) {
		root = deleteRecursive(root, data);
	}
	
	public Node deleteRecursive(Node root, int data) {
		if (root == null) {
			return root;
		}
		
		if (data< root.data) {
			root.left = deleteRecursive(root.left, data);
		}
		else if (data>root.data) {
			root.right = deleteRecursive(root.right, data);
		}
		else {
			if (root.left== null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			
			root.data = minValue(root.right);
			root.right = deleteRecursive(root.right, root.data);
		}
		
		return root;
	}
	
	public int minValue(Node root) {
		int minval = root.data;
		while (root.left !=null) {
			minval = root.left.data;
			root = root.left;
		}
		return minval;
	}
	
	public boolean Search(int data) {
		root = searchRecursive(root, data);
		if (root != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Node searchRecursive(Node root,int data) {
		if (root == null || root.data == data) {
			return root;
		}
		if (data<root.data) {
			return searchRecursive(root.left, data);
		}
		else if (data>root.data) {
			return searchRecursive(root.right, data);
		}
		
		return root;
	}
	

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(45);
		tree.insert(10);
		tree.insert(7);
		tree.insert(12);
		tree.insert(6);
		tree.insert(47);
		tree.insert(7);
		tree.insert(8);
		tree.insert(9);
		tree.preOrder();
		System.out.println();
		tree.inOrder();
		tree.delete(10);
		System.out.println();
		tree.inOrder();
		System.out.println(tree.Search(8));
	}
}