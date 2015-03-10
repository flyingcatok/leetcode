package algorithms;

/**
 * if found, return index, else return -1.
 * @author feiyu
 * @since March 9, 2015
 */
public class BinarySearch {
	public static void main(String args[]){
		int[] array = new int[7];
		for(int i=0;i<7;i++){
			array[i] = i;
		}
		System.out.println(binarySearch(array, 0));
	}
	
	private static int binarySearch(int[] A, int target){
		int start = 0, end = A.length-1;
		while(start <= end){
			int mid = start+(end-start)/2;
			if(A[mid]==target){
				return mid;
			}else if(A[mid] > target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
		
	}
}
