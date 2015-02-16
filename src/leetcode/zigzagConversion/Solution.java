package leetcode.zigzagConversion;

/**
 * string builder array
 * @author feiyu
 * @since January 1, 2015
 */
public class Solution {
	public static String convert(String s, int nRows) {
		int N = s.length();
		if(N <= nRows||nRows ==1){
			return s;
		}
		
		StringBuilder[] stack = new StringBuilder[nRows];
		// init string builder array
		for(int i=0;i<stack.length;i++){
			stack[i] = new StringBuilder();
		}
		// to store final result
		StringBuilder result = new StringBuilder();
		char[] chars = s.toCharArray();
		// index: 1,2,...,nRows,nRows-1,...,1,2,...
		int index=0, turn = 1;
		for(int i=0; i<chars.length;i++){
			index += turn;
			if(index == nRows){
				turn = -1;
			}
			if(index == 1){
				turn = 1;
			}
			stack[index-1].append(chars[i]);
		}
		for(int i=0;i<stack.length;i++){
			result.append(stack[i].toString());
		}
		
		return result.toString();
        
    }
}
