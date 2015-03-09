package leetcode.plusOne;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * @author feiyu
 * @since March 8, 2015
 */
public class Problem66 {

	public static void main(String[] args) {
		int[] number = new int[5];
		number[0] = 1;
		number[1] = 2;
		number[2] = 9;
		number[3] = 9;
		number[4] = 9;
		for(int i=0;i<5;i++){
			System.out.print(number[i]);
		}
		System.out.println();
		int [] number2 = Solution.plusOne(number);
		for(int i=0;i<number2.length;i++){
			System.out.print(number2[i]);
		}
	}

}
