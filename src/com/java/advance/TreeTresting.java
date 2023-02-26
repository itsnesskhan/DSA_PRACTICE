package com.java.advance;
public class TreeTresting {
	public static void main(String[] args) {
		TreeNode<String> treeStructure = new TreeNode<String>("Electronics");
		
		treeStructure.addChild(new TreeNode<String>("TV"));
		treeStructure.addChild(new TreeNode<String>("Mobile"));
		treeStructure.addChild(new TreeNode<String>("Refregirator"));
		
		
		System.out.println(treeStructure);
		System.out.println(treeStructure.getData());
		System.out.println(treeStructure.getParent());
		System.out.println(treeStructure.getChidren());
	}
}
