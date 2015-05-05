package leetcode.wordBreak;

import java.util.Set;

/**
 * DP: can[i]: can first i letters can be successfully divided.
 * @author feiyu
 * @since May 4, 2015
 */
public class Solution {
    public static boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null){
            return false;
        }
        boolean[] can = new boolean[s.length()+1];
        can[0] = true;
        for(int i = 1; i < s.length()+1;i++){
            for(int j = 0; j < i; j++){
                if(can[j] && wordDict.contains(s.substring(j, i))){
                    can[i] = true;
                    break;
                }
            }
        }
        return can[s.length()];
    }
}
