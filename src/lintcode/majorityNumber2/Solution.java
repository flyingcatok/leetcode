package lintcode.majorityNumber2;

import java.util.List;

/**
 * similar to majority element. except that it has 2 candidates.
 * time: O(n), space: O(1)
 * @author feiyu
 * @since April 13, 2015
 */
public class Solution {
	public static int majorityNumber(List<Integer> nums) {
        if (nums.size() == 0) {
            return -1;
        }
        int candidate1 = -1;
        int count1 = 0;
        int candidate2 = -1;
        int count2 = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count1 == 0 && count2 == 0) {
                candidate1 = nums.get(i);
                count1 = 1;
            }
            else if(count1 == 0 && candidate2 != nums.get(i)) {
                candidate1 = nums.get(i);
                count1 = 1;
            }
            else if(count2 == 0 && candidate1 != nums.get(i)) {
                candidate2 = nums.get(i);
                count2 = 1;
            }
            else {
                if (candidate1 == nums.get(i)){
                    count1++;
                } else if(candidate2 == nums.get(i)){
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
            
        }
        // determine which candidate has more counts
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.size(); i++){
            if(candidate1 == nums.get(i)){
                count1++;
            }
            if(candidate2==nums.get(i)){
                count2++;
            }
        }
        return count1 > count2 ? candidate1:candidate2;
    }
}
