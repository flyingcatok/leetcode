package leetcode.plusOne;

/**
 * 
 * @author feiyu
 * @since March 8, 2015
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum=0;
        for(int i=0;i<n;++i){
        	sum+=digits[i];
        }
        int[] number;
        if(sum == n*9){
        	number = new int[n+1];
        	int carry = 0;
            for(int i=n; i>0;--i){
            	if(i==n){
            		number[i] = (digits[i-1]+carry+1) %10;
            		carry = (digits[i-1]+carry+1) /10;
            	}else{
            		number[i] = (digits[i-1]+carry)%10;
            		carry = (digits[i-1]+carry)/10;
            	}

            }
            number[0] = 1;
        }else{
        	number = new int[n];
        	int carry = 0;
        	for(int i=n-1;i>=0;--i){
        		if(i==n-1){
        			
        			number[i] = (digits[i]+carry+1)%10;
        			carry = (digits[i]+carry+1)/10;
        		}else{
        			
        			number[i] = (digits[i]+carry)%10;
        			carry = (digits[i]+carry)/10;
        		}
        	}
        }
        
        return number;
    }
}
