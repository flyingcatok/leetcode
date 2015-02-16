package leetcode.reverseInt;

/**
 * 
 * @author feiyu
 * @since January 1, 2015
 */
public class Solution {
	public static int reverse(int x) {
		int sgn = 1;
		if(x<0){
			x = -x;
			sgn = -sgn;
		}
		// use of log10(x), special: x=0
		int numOfDigits = (x == 0) ? 1:(int)(Math.log10(x)+1);
		int[] digits = new int[numOfDigits];
		// store digits in array
		int i=0;
		while(x >0){
			digits[i] = x % 10;
			x = x / 10;
			i++;
		}
		// compute reverse int
		int y=0;
		for(int j=0; j<numOfDigits;++j){
			double a = digits[j]*Math.pow(10, (numOfDigits-1-j));
			// check overflow, if true, return 0
			if((sgn ==1 && y+a>Integer.MAX_VALUE) || (sgn ==-1 && y+a-1 >Integer.MAX_VALUE)){
				return 0;
			}else{
				y = (int) (y+a);
			}
		}
		return sgn*y;
        
	}
}
