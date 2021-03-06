package algorithms;

/**
 * another point of view of binary search. find the first position of target.
 * this method need to extra check boundary, 
 * which is good when dealing with possible index out of bound.
 * @author feiyu
 * @since March 11, 2015
 */
public class BinarySearch2 {

	public static void main(String[] args) {
		int[] array = new int[7];
		for(int i=0;i<7;i++){
			array[i] = i;
		}
		array[3]=2;
		System.out.println(binarySearch(array, 2));
	}

	/**
	 * find the first position of target.
	 * @param A sorted array
	 * @param target
	 * @return index
	 */
	private static int binarySearch(int[] A, int target){
		int start = 0, end = A.length-1;
		// no index overflow. but need to check boundary elements
		while(start +1 < end){	// not start <= end
			int mid = start+(end-start)/2;
			if(A[mid]==target){
				end = mid;// first position
			}else if(A[mid] > target){
				end = mid; // not -1
			}else{
				start = mid; // not +1
			}
		}
		// extra check boundary
		// find first position, check start first
		if(A[start] == target){
			return start;
		}
		if(A[end] == target){
			return end;
		}
		return -1;

	}
}
