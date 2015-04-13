package others.bomb;

import java.util.ArrayList;
import java.util.List;

/**
 * Zenefits Data Engineer OA
 * Given a sorted array, find if an array contains a bomb.
 * A bomb is: 3 consecutive pairs of integers.
 * e.g.: 2,2,3,3,4,4
 * there maybe more than 2 integers.
 * e.g.: 2,2,3,3,3,4,4
 * this is not a bomb: 2,2,3,3,5,5
 * @author feiyu
 * @since April 13, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,2,3,3,4,4,4};
		System.out.println(contains_bomb(arr));
	}

    static boolean contains_bomb(int[] arr) {
        if (arr == null) {
            return false;
        }
        if (arr.length < 6) {
            return false;
        }
        int count = 1;
        int prev = arr[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (prev != arr[i]) {
                count = 1;
            } else {
                count++;
                if(count == 2){
                	list.add(arr[i]);
                }
            }
            prev = arr[i];
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) * 2 == list.get(i - 1) + list.get(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
