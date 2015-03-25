package algorithms;

/**
 * this binary search find the last position of target in a sorted array.
 * @author feiyu
 * @since March 25, 2015
 */
public class BinarySearch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[7];
		for(int i=0;i<7;i++){
			array[i] = i;
		}
		array[3]=2;
		System.out.println(binarySearch(array, 2));
	}
	
	/**
	 * find the last position of target.
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
				start = mid;// last position
			}else if(A[mid] > target){
				end = mid; // not -1
			}else{
				start = mid; // not +1
			}
		}
		// extra check boundary
		// find last position, check end first
		if(A[end] == target){
			return end;
		}
		if(A[start] == target){
			return start;
		}
		return -1;

	}

}
