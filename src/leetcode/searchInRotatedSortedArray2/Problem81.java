package leetcode.searchInRotatedSortedArray2;

/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * Would this affect the run-time complexity? How and why?
 * Write a function to determine if a given target is in the array.
 * @author feiyu
 * @since March 25, 2015
 */
public class Problem81 {

	public static void main(String[] args) {
		int[] A = new int[7];
		A[0] = 4;
		A[1] = 5;
		A[2] = 6;
		A[3] = 6;
		A[4] = 0;
		A[5] = 1;
		A[6] = 2;
		System.out.println(search(A,5));
	}
	
	/**
	 * time complexity: O(n). black-box testing: suppose first n-1 elements are 1s, nth is 0, then time complexity is O(n).
	 * @param A array
	 * @param target
	 * @return boolean
	 */
	public static boolean search(int[] A, int target) {
        for(int i=0; i< A.length;i++){
            if(A[i] == target){
                return true;
            }
        }
        return false;
    }
}
