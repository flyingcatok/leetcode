package lintcode.strStr;

class Solution {
    /**
     * Returns a index to the first occurrence of target in source, or -1
     * if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     * @author feiyu
     * @since March 20, 2015
     */
    public static int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null){
            return -1;
        }
        final int srcLength = source.length();
        final int tarLength = target.length();
        if (srcLength < tarLength){
            return -1;
        }
        if (tarLength == 0){
            return 0;
        }
        int index = -1;
        for (int i = 0; i <= srcLength - tarLength; i++){
            char sChar = source.charAt(i);
            char tChar = target.charAt(0);
            if (sChar != tChar){
                continue;
            } else {
                index = i;
                for (int j = 1; j < tarLength; j++){
                    char srcChar = source.charAt(i + j);
                    char tarChar = target.charAt(j);
                    if (srcChar != tarChar){
                        break;
                    }
                }
                break;
            }
        }
        return index;
    }
}
