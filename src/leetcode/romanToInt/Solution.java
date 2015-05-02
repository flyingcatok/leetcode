package leetcode.romanToInt;

import java.util.HashMap;

/**
 * O(n)
 * @author feiyu
 * @since May 2, 2015
 */
public class Solution {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        
        int result = hash.get(s.charAt(s.length() -1));
        for (int i = s.length()-2; i >=0; i--) {
            if (hash.get(s.charAt(i)) >= hash.get(s.charAt(i+1))){
                result += hash.get(s.charAt(i));
            } else {
                result -= hash.get(s.charAt(i));
            }
        }
        return result;
    }
}
