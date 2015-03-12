package leetcode.search2DMatrix;

/**
 * search row first, then column
 * @author feiyu
 * @since March 11, 2015
 */
public class Solution {
	public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low_row = 0;
        int high_row = m-1;
        int low_col = 0;
        int high_col = n-1;
        while(low_row <= high_row){
            int mid_row = low_row +(high_row-low_row)/2;
            if(matrix[mid_row][0] == target){
            	return true;
            }else
            if(matrix[mid_row][0] > target){
                high_row = mid_row -1;
            }else{
                low_row = mid_row +1;
            }
        }
        if(high_row < 0){	//check index overflow
            return false;
        }
        while(low_col <= high_col){
        	if(low_col <0 || high_col >n-1){	// check index overflow
        		break;
        	}
            int mid_col = low_col + (high_col - low_col)/2;
            if(matrix[high_row][mid_col] == target){
                return true;
            }else
            if(matrix[high_row][mid_col] > target){
                high_col = mid_col -1;
            }else{
                low_col = mid_col +1;
            }
        }
        return false;
    }
}
