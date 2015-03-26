package leetcode.powxn;

/**
 * binary search, recursively reduce n
 * @author feiyu
 * @since March 26, 2015
 */
public class Solution {
	public static double pow(double x, int n) {
        if(n == 0){
            return 1;
        }
        // must have. n = 1, k = 0, l = 1: stack overflow
        if(n == 1){
            return x;
        }
        boolean isNegative = false;
        if(n < 0){
            isNegative  = true;
            n = -n;
        }
        int k = n / 2;
        // remainder
        int l = n - k * 2;
        
        double t1 = pow(x, k);
        double t2 = pow(x, l);
        
        if(isNegative){
            return 1/(t1*t1*t2);
        }else{
            return t1*t1*t2;
        }
    }
}
