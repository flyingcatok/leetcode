package dataStructures;

import java.util.Stack;

/**
 * Implement a queue using two stacks.
 * @author feiyu
 * @since March 31, 2015
 */
public class QueueFromStack<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public QueueFromStack(){
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}
	
	public T enQueue(T e){
		return stack1.push(e);
	}
	
	public T deQueue(){
		if(stack1.isEmpty() && stack2.isEmpty()){
			return null;
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public int size(){
		return stack1.size() + stack2.size();
	}
	
	public static void main (String args[]){
		QueueFromStack<Integer> queue = new QueueFromStack<>();
		for (int i = 0; i < 10; i++){
			queue.enQueue(i);
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(queue.deQueue());
		}
	}
}
