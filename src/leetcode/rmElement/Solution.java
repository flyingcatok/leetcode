package leetcode.rmElement;

/**
 * 
 * @author feiyu
 * @since January 2, 2015
 */
public class Solution {
	public static int removeElement(int[] A, int elem) {
		int N = A.length;
		// 2 pointers
		int p1=0,p2=N-1;
		while(p1 <= p2){
			if(A[p1] != elem){
				p1++;
			}else{
				while(A[p2] == elem){
					if(p2>p1){
						p2--;
					}else{
						return p1;
					}
					
				}
				A[p1] = A[p2];
				p1++;
				p2--;
			}
		}
		return p1;
        
    }
}
