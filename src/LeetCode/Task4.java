package LeetCode;

import java.util.Arrays;

public class Task4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultArray = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,resultArray,0,nums1.length);
        System.arraycopy(nums2,0,resultArray,nums1.length, nums2.length);
        return (double) (resultArray[resultArray.length / 2] + resultArray[resultArray.length / 2 - 1]) / 2;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
