package leetcode.strStr;

/**
 * 
 * @author feiyu
 * @since March 20, 2015
 */
public class Solution {
    public static int strStr(String haystack, String needle) {
        //write your code here
        if (haystack == null || needle == null){
            return -1;
        }
        final int srcLength = haystack.length();
        final int tarLength = needle.length();

        int i, j;
        for (i = 0; i < srcLength - tarLength + 1;i++){
            for (j = 0; j < tarLength; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            // see if needle are completely examined
            if(j == tarLength){
                return i;
            }
        }
        return -1;
    }
}
