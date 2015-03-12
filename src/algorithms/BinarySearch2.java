package algorithms;

/**
 * another point of view of binary search.
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
		System.out.println(binarySearch(array, 0));
	}

	private static int binarySearch(int[] A, int target){
		int start = 0, end = A.length-1;
		// no index overflow. but need to check boundary elements
		while(start +1 < end){	// not start <= end
			int mid = start+(end-start)/2;
			if(A[mid]==target){
				return mid;
			}else if(A[mid] > target){
				end = mid; // not -1
			}else{
				start = mid; // not +1
			}
		}
		// extra check boundary
		if(A[start] == target){
			return start;
		}else if(A[end] == target){
			return end;
		}
		return -1;

		
	}
}
