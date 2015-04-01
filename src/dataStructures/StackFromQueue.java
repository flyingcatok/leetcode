package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a stack using two queues.
 * @author feiyu
 * @since March 31, 2015
 */
public class StackFromQueue<E> {
	private Queue<E> queue1;
	private Queue<E> queue2;
	
	public StackFromQueue(){
		queue1 = new LinkedList<E>();
		queue2 = new LinkedList<E>();
	}
	
	public E pop(){
		return queue1.poll();
	}
	
	public E push(E e){
		queue2.offer(e);
		while(!queue1.isEmpty()){
			queue2.offer(queue1.poll());
		}
		// swap names of queue1 and queue2
		Queue<E> temp;
		temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return e;
	}
	
	public int size(){
		return queue1.size() + queue2.size();
	}
	
	public static void main(String[] args) {
		StackFromQueue<Integer> stack = new StackFromQueue<>();
		
		for (int i = 0; i < 10; i++){
			stack.push(i);
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(stack.pop());
		}
	}

}
