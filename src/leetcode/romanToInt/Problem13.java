package leetcode.romanToInt;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author feiyu
 * @since May 2, 2015
 */
public class Problem13 {

	public static void main(String[] args) {
		String roman = "MDCCCIV";
		System.out.println("expect 1804: " + Solution.romanToInt(roman));
	}

}
