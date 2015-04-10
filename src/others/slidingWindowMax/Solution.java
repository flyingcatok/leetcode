package others.slidingWindowMax;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * We create a Dequeue, Qi of capacity k, that stores only useful elements of current window of k elements. 
 * An element is useful if it is in current window and is greater than all other elements on left side of it in current window. 
 * We process all array elements one by one and maintain Qi to contain useful elements of current window 
 * and these useful elements are maintained in sorted order. 
 * The element at front of the Qi is the largest and element at rear of Qi is the smallest of current window.
 * 
 * ref: http://www.geeksforgeeks.org/maximum-of-all-subarrays-of-size-k/
 * @since April 10, 2015
 */
public class Solution {
	public static int[] maxSlidingWindow(int[] array, int k) {
		if (array == null) {
			return null;
		}
		final int N = array.length;
		int[] result = new int[N];
		if (N <= k) {
			Arrays.fill(result, getMax(array));;
			return result;
		}
		
		Deque<Integer> deque = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {
			while (!deque.isEmpty() && array[i] > array[deque.peekLast()]) {
				deque.pollLast();
			}
			deque.addLast(i);
		}
		for (; i < N; i++) {
			result[i - k] = array[deque.peekFirst()];
			
			while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
				deque.pollFirst();
			}
			while (!deque.isEmpty() && array[i] >= array[deque.peekLast()]) {
				deque.pollLast();
			}
			deque.addLast(i);
		}
//		result[N - k] = array[deque.peekFirst()];
		// fill the rest of array
		for (i = N - k; i < N; i++) {
			result[i] = array[deque.peekFirst()];
		}
		return result;
	}
	
	private static int getMax(int[] array) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if ( array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}
}
