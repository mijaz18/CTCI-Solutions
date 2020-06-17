import java.util.*;

public class KthLast{
	private static class Node{
		Node next;
		int data;
		public Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
	}
	public static int Kthlast(Node head, int k){
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<k; i++){
			p2 = p2.next;
		}
		while(p2 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1.data;
	}
	public static void main(String args[]){
		Node head = new Node(null, 7);
		Node h1 = new Node(null, 5);
		Node h2 = new Node(null, 3);
		Node h3 = new Node(null, 4);
		Node h4 = new Node(null, 9);
		Node h5 = new Node(null, 8);
		Node h6 = new Node(null, 11);
		head.next = h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		System.out.println(Kthlast(head, 1));
	}
}