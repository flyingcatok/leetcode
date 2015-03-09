package leetcode.containerWithMostWater;

/**
 * for ai at i, max area is achieved at farest j from i such that aj > ai.
 * @author feiyu
 * @since March 9, 2015
 */
public class Solution {
	public static int maxArea(int[] height) {
        int n = height.length;
        if(height == null || n < 2){
        	return 0;
        }
        int area = 0;
        int p1=0, p2=n-1;
        while(p1<p2){
            area = Math.max(Math.min(height[p1],height[p2])*(p2-p1),area);
            // move shorter board 
            if(height[p1]<height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return area;
    }
}
