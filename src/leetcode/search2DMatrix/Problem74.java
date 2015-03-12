package leetcode.search2DMatrix;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * @author feiyu
 * @since March 11, 2015
 */
public class Problem74 {

	public static void main(String[] args) {
//		int[][] matrix = new int[3][4];
//		matrix[0][0] = 1;
//		matrix[0][1] = 3;
//		matrix[0][2] = 5;
//		matrix[0][3] = 7;
//		matrix[1][0] = 10;
//		matrix[1][1] = 11;
//		matrix[1][2] = 16;
//		matrix[1][3] = 20;
//		matrix[2][0] = 23;
//		matrix[2][1] = 30;
//		matrix[2][2] = 34;
//		matrix[2][3] = 50;
		int[][] matrix = new int[2][1];
		matrix[0][0] = 1;
		matrix[1][0] = 3;
//		matrix[0][2] = 5;
//		System.out.println(matrix[0].length);
		System.out.println("search for 3: " + Solution.searchMatrix(matrix, 1));
		System.out.println(Solution2.searchMatrix(matrix, 3));
	}

}
