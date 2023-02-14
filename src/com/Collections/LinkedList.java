package com.Collections;

class Node<T>{
	
	T data;
	Node next;
	
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}

public class LinkedList {
	
	Node head;
	
	void add(int data) {
		
		Node<Integer> nodeToAdd = new Node<Integer>(data);
		
		if (head == null) {
			head = nodeToAdd;
			return;
		}
		else {
			Node preNode = head;
			
			while (preNode.next!=null) {
				preNode = preNode.next;
			}
			
			preNode.next = nodeToAdd;
			
		}
		return;	
	}
	
	<T> void delete(int index) {
		if (index == 0) {
			head = head.next;
			return;
		}
			Node<T> preNode = head;
		for (int i = 0; i < index-1; i++) {
			preNode = preNode.next;
		}
		
		preNode.next = preNode.next.next;
	}
	
	
	
	 void printList() {
		Node current = head;
		while (current!=null) {
			String prefix = current.next!=null?"-->":"";
			System.out.print(current.data+ prefix);
			current = current.next;
		}
	}
	 
	  <T> void reverse(){
		 Node<T> currNode = head;
		 Node<T> prevNode = null;
		 
		 while (currNode!=null) {
			
			 Node<T> next = currNode.next;
			 currNode.next = prevNode;
			 prevNode = currNode;
			 currNode = next;
		}
		 head = prevNode;
	 }
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,3,9};
		LinkedList list = new LinkedList();
		list.add(3);
		list.add(6);
		list.add(12);
		list.add(34);
		list.add(8);
//		list.delete(2);
		list.printList();
		System.out.println();
		list.reverse();
		list.printList();
		
	}

}
