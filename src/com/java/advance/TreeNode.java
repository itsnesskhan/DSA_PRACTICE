package com.java.advance;
import java.util.HashSet;

public class TreeNode<T> {
	private T data;
	private HashSet<TreeNode<T>> chidren;
	private TreeNode<T> parent = null;
	
	public TreeNode(T data) {
		this.data = data;
		this.chidren = new HashSet<TreeNode<T>>();
	}
	
	public TreeNode<T> addChild(TreeNode<T> child){
		child.setParent(this);
		this.chidren.add(child);
		return child;
	}
	
	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public HashSet<TreeNode<T>> getChidren() {
		return chidren;
	}

	public void setChidren(HashSet<TreeNode<T>> chidren) {
		this.chidren = chidren;
	}

	public TreeNode<T> getParent() {
		return parent;
	}

	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", chidren=" + chidren + ", parent=]";
	}

	

		
	
	
}