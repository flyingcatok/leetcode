package lintcode.majorityNumber2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, the majority number is the number that occurs more than 1/3 of the size of the array. Find it.
 * Note: There is only one majority number in the array.
 * @author feiyu
 * @since April 13, 2015
 */
public class Problem {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(1,1,1,1,2,2,3,3,4,4,4);
		
		System.out.println("majority number: " + Solution.majorityNumber(list));
	}

}
