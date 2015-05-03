package leetcode.intToRoman;

/**
 * 
 * ref: https://stupidcodergoodluck.wordpress.com/2014/03/31/leetcode-integer-to-roman/
 * @since May 3, 2015
 */
public class Solution {
	public static String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        int[] digits = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < digits.length; ++i) {
            while (num >= digits[i]) {
                res.append(roman[i]);
                num -= digits[i];
            }
        }
        return res.toString();
    }
}
