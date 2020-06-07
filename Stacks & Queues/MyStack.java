import java.util.*;

public class MyStack<T> {
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;

	}
}

private StackNode<T> top;

	public T pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item){
		StackNode<T> newNode = new StackNode<T>(item);
		newNode.next = top;
		top = newNode;
	}

	public T peek(){
		if(top == null){
			throw new EmptyStackException();
		}
		return top.data;
	}

	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		MyStack<Integer> newStack = new MyStack<Integer>();
		newStack.push(10);
		newStack.push(9);
		newStack.push(8);
		System.out.println(newStack.peek());
		newStack.pop();
		System.out.println(newStack.peek());
		System.out.println(newStack.isEmpty());
		newStack.pop();
		newStack.pop();
		System.out.println(newStack.isEmpty());
	}
}