import java.util.*;


public class RemoveDups{
	private static class Node{
		Node next;
		int data;
		public Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
	}
	public static void removeDups(Node head){
		Node current = head;
		while(current != null){
			Node runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(String args[]){
		Node head = new Node(null, 7);
		Node h1 = new Node(null, 5);
		Node h2 = new Node(null, 3);
		Node h3 = new Node(null, 7);
		Node h4 = new Node(null, 3);
		Node h5 = new Node(null, 3);
		Node h6 = new Node(null, 11);
		head.next = h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		removeDups(head);
		System.out.println(head.data + " " + head.next.data + " " + head.next.next.data + " " + head.next.next.next.data);
	}
}