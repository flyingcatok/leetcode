package leetcode.palindromeNumber;

/**
 * 
 * @author feiyu
 * @since January 7, 2015
 */
public class Solution {
	public static boolean isPalindrome(int x) {
		if (x<0){
			return false;
		}
		if(x<10){
			return true;
		}
		// x>0
		// get digits
		int digits = (int)(Math.log10(x)+1);
		int lastHalf = 0;
		int firstHalf = 0;
		for(int i=0; i<digits/2;++i){
			lastHalf += (x % (int)Math.pow(10, i+1) / (int)Math.pow(10, i) ) * (int)Math.pow(10, i);
			firstHalf += (x % (int)Math.pow(10, i+1)/ (int)Math.pow(10, i) ) * (int)Math.pow(10, digits-1-i);
		}
			
		if(digits %2 == 0){
			return (x == firstHalf + lastHalf);
		}else{
			return (x - firstHalf - lastHalf)>=0 && (x - firstHalf - lastHalf) / (int)Math.pow(10, digits/2) < 10;
		}
        
    }
}
