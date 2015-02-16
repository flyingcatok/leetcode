package leetcode.validParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * stack
 * @author feiyu
 * @since January 4, 2015
 */
public class Solution {
	public static boolean isValid(String s) {
		if(s == null){
			return false;
		}
		if(s.equals("")){
			return true;
		}
		char[] charArray = s.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(char c:charArray){
			if(c == '(' || c == '[' || c== '{'){
				stack.addFirst(c);
			}else{
				if(!stack.isEmpty()){
					if(!isMatch(stack.removeFirst(),c) ){
						return false;
					}
					
				}else{
					return false;//no left (
				}
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
        
    }
	
	private static boolean isMatch(char c1, char c2){
		return (c1=='('&&c2==')' || c1=='[' &&c2==']' || c1=='{'&&c2=='}');
	}
}
