package lintcode.backpack2;

/**
 * DP. mv[i][j] = 
 * @author feiyu
 * @since May 6, 2015
 */
public class Solution {
    public static int backPackII(int m, int[] A, int V[]) {
        // write your code here
        if(m == 0) {
            return 0;
        }
        if(A == null || A.length == 0){
            return 0;
        }
        if(V == null || V.length == 0){
            return 0;
        }
        int[][] mv = new int[A.length+1][m+1];
        for(int i =0; i<A.length+1;i++){
            mv[i][0] = 0;
        }
        // init detail:
        //初始化的f数组事实上就是在没有任何物品可以放入背包时的合法状态。
        //如果要求背包恰好装满，那么此时只有容量为0的背包可能被价值为0的nothing“恰好装满”，其它容量的背包均没有合法的解，属于未定义的状态，它们的值就都应该是-∞了。
        //如果背包并非必须被装满，那么任何容量的背包都有一个合法解“什么都不装”，这个解的价值为0，所以初始时状态的值也就全部为0了。
        for(int i =0; i < m+1; i++){
            mv[0][i] = 0;
        }
        for(int i =1; i < A.length+1; i++) {
            for(int j =1; j < m+1; j++){
                if(j >= A[i-1]){
                    mv[i][j] = Math.max(mv[i-1][j-A[i-1]] + V[i-1], mv[i-1][j]);
                } else {
                    mv[i][j] = mv[i-1][j];
                }
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for(int i =0; i<m+1;i++){
            if(mv[A.length][i] >= maxValue){
                maxValue = mv[A.length][i];
            }
        }
        return maxValue;
    }
}
