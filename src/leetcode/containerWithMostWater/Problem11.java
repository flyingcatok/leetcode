package leetcode.containerWithMostWater;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two end points of line i is at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container.
 * @author feiyu
 * @since March 9, 2015
 */
public class Problem11 {

	public static void main(String[] args) {
		final int N = 15000;
		int[] heights = new int[N];
		for(int i=0;i<N; ++i){
			heights[i] = N-i;
		}
		System.out.println("max area: "+Solution.maxArea(heights));
	}

}
