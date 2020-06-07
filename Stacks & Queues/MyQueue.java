import java.util.*;

public class MyQueue<T> {
	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;

		public QueueNode(T data){
			this.data = data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public T remove(){
		if(first == null){
			throw new EmptyStackException();
		}
		T item = first.data;
		first = first.next;
		return item;
	}

	public void add(T item){
		QueueNode<T> newNode = new QueueNode<T>(item);
		if(last != null){
			last.next = newNode;
		}
		last = newNode;
		if(first == null){
			first = last;
		}

	}

	public T peek(){
		if(first == null){
			throw new EmptyStackException();
		}
		return first.data;
	}

	public boolean isEmpty(){
		if(first == null){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		MyQueue<Integer> newQueue = new MyQueue<Integer>();
		newQueue.add(10);
		newQueue.add(9);
		newQueue.add(8);
		System.out.println(newQueue.peek());
		newQueue.remove();
		System.out.println(newQueue.peek());
		System.out.println(newQueue.isEmpty());
		newQueue.remove();
		newQueue.remove();
		System.out.println(newQueue.isEmpty());
	}
}