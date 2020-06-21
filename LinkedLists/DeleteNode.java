import java.util.*;

public class DeleteNode{
	private static class Node{
		Node next;
		int data;
		public Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
	}

	public static void delNode(Node n){
		n.data = n.next.data;
		n.next = n.next.next;
	}

	public static void main(String args[]){
		Node head = new Node(null, 7);
		Node h1 = new Node(null, 5);
		Node h2 = new Node(null, 3);
		Node h3 = new Node(null, 6);
		Node h4 = new Node(null, 8);
		Node h5 = new Node(null, 2);
		Node h6 = new Node(null, 11);
		head.next = h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		delNode(h2);
		System.out.println(head.data + " " + head.next.data + " "+ head.next.next.data);	
	}
}