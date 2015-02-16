package leetcode.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author feiyu
 * @since January 6, 2015
 */
public class Solution {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
		for(int i=0; i< numRows; ++i){
			List<Integer> temp = new ArrayList<Integer>(i);
			if(i==0){
				temp.add(1);
				pascal.add(i,temp);
			}else if(i==1){
				temp.add(1);
				temp.add(1);
				pascal.add(i,temp);
			}else{
				temp.add(1);
				List<Integer> lastRow = new ArrayList<Integer>(pascal.get(i-1));
				for(int j=0;j<lastRow.size()-1;++j){
					temp.add(lastRow.get(j)+lastRow.get(j+1));
				}
				temp.add(1);
				pascal.add(i,temp);
			}
			
		}
		return pascal;
        
    }
}
