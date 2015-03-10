package leetcode.findMinInRotatedSortedArray;

/**
 * reference: http://www.ninechapter.com/solutions/find-minimum-in-rotated-sorted-array/
 * @since March 9, 2015
 *
 */
public class Solution2 {
    public static int findMin(int[] num) {
        int start = 0, end = num.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] >= num[end]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (num[start] < num[end]) {
            return num[start];
        } else {
            return num[end];
        }
    }
}
