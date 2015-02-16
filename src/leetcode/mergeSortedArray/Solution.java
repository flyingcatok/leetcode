package leetcode.mergeSortedArray;

/**
 * although it costs very little time. I need a simpler answer. time:O(m+n)
 * @author feiyu
 * @since January 5, 2015
 */
public class Solution {
	public static void merge(int A[], int m, int B[], int n) {
		// B is empty
        if(n==0){
        	return;
        }
        // A is empty
        if(m==0){
        	for(int i=0;i<n;++i){
        		A[i] = B[i];
        	}
        	return;
        }
        // all B are larger than A
        if(A[m-1]<=B[0]){
        	for(int i=m;i<m+n;++i){
        		A[i] = B[i-m];
        	}
        	return;
        }
        // all A are larger than B
        if(A[0]>B[n-1]){
        	move(A,m,m,n);
        	for(int i=0;i<n;++i){
        		A[i]=B[i];
        	}
        	return;
        }
        // A,B are not empty
        // 2 pointers
        int p1=0,p2=0;
        int batch=0,length = m;
        while(p2<n && p1<m+n){
        	if(B[p2]<A[p1]){
        		p2++;
        		batch++;
        	}else{
        		move(A,length,length-p1,batch);
        		
        		for(int i=0;i<batch;++i){
        			A[p1+i]=B[p2-batch+i];
        		}
        		p1 += batch+1;
        			
        		length += batch;
        		batch = 0;
        	}
        }
        // all B move together
        if(p2==n){
        	move(A,length,length-p1,batch);
        	for(int i=0;i<batch;++i){
    			A[p1+i]=B[p2-batch+i];
    		}
        }
        // move element in B which are larger than elements in A into A
        for(int i=p2;i<n;++i){
        	A[m+i] = B[i];
        }
    }
	
	/**
	 * move last 'last' elements to the right by 'num' positions in A.
	 * @param A array
	 * @param length first length are filled, rest are 0 or unoccupied
	 * @param last last 'last' elements of total 'length'
	 * @param num number of positions to move
	 */
	private static void move(int A[], int length, int last, int num){
		if(num==0){
			return;
		}
		for(int i=length-1; i>=length-last;--i){
			A[i+num]=A[i];
		}
	}
}
