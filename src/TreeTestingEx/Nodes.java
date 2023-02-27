package TreeTestingEx;

import java.util.HashSet;

public class Nodes {
	private int data;
	private HashSet<Nodes> children;
	private Nodes parent = null;
	
	
	public Nodes(int data){
		this.data = data;
		children = new HashSet<Nodes>();
	}
	
	public void addChild(Nodes child) {
		child.setParent(this);
		children.add(child);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public HashSet<Nodes> getChildren() {
		return children;
	}

	public void setChildren(HashSet<Nodes> children) {
		this.children = children;
	}

	public Nodes getParent() {
		return parent;
	}

	public void setParent(Nodes parent) {
		this.parent = parent;
	}
	
	public void printTree() {
				System.out.println(this.data);
		
		for (Nodes nodes : children) {
			nodes.printTree();
		}
	}

	@Override
	public String toString() {
		return "Nodes [data=" + data + ", children=" + children + ", parent=" + parent + "]";
	}
	
	
	

}
