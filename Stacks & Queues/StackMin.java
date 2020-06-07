import java.util.*;

public class StackMin {
	private static class StackNode{
		private int data;
		private int min;
		private StackNode next;

		public StackNode(int data){
			this.data = data;
			this.min = Integer.MAX_VALUE;
		}
	}

	private StackNode top;

	public void push(int data){
		StackNode newNode = new StackNode(data);
		if(top == null || data < top.min){
			newNode.min = data;
		}else{
			newNode.min = top.min;
		}
		newNode.next = top;
		top = newNode;
	}

	public int pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		int item = top.data;
		top = top.next;
		return item;
	}

	public int min(){
		if(top == null){
			throw new EmptyStackException();
		}
		return top.min;
	}

	public static void main(String args[]){
		StackMin newStack = new StackMin();
		newStack.push(6000);
		newStack.push(10);
		newStack.push(0);
		System.out.println(newStack.min());
		newStack.pop();
		System.out.println(newStack.min());
		newStack.pop();
		System.out.println(newStack.min());
		newStack.pop();
	}

}