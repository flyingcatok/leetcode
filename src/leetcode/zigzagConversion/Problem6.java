package leetcode.zigzagConversion;

/**
 * 
 * @author feiyu
 * @since January 1. 2015
 */
public class Problem6 {

	public static void main(String[] args) {
		String zig = "PAYPALISHIRING";
//		String zig = "AB";
		System.out.println(Solution.convert(zig, 3).equals("PAHNAPLSIIGYIR"));
	}

}
