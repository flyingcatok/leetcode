package leetcode.intToRoman;

/**
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author feiyu
 * @since May 3, 2015
 */
public class Problem12 {

	public static void main(String[] args) {
		int num = 3486;
		System.out.println("expect MMMCDLXXXVI: " +Solution.intToRoman(num));
	}

}
