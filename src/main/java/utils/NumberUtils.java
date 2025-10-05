package utils;

import java.util.Arrays;

public class NumberUtils {
    //Exercise 1:
    //Write a static method called getPos() in NumberUtils that finds the first position of a supplied int in an array.
    //• Parameters: An array of ints and a single int
    //• Returns: an int (the position)
    //Write a JavaDoc for this method.

    /**
     * @param nums the array to searched
     * @param pos  the position that looking for
     * @return the first position of a supplied int in an array
     */
    public static int getPos(int[] nums, int pos) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pos) {
                return i;
            }
        }
        return -1;
    }
//    Exercise 2:
//    Write a static method called getLastPos() in NumberUtils that finds the last position of a supplied int in an array.
//    • Parameters: An array of ints and a single int
//    • Returns: an int (the position)

    /**
     *
     * @param nums         the array to be seached from input
     * @param lastPosition looking for value that will be the last position
     * @return the last position of an array that have in supplied
     */
    public static int getLastPos(int[] nums, int lastPosition) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == lastPosition) {
                return i;
            }
        }
        return -1;
    }

    //Exercise 3:
    //Write a static method called isIdentical() in NumberUtils that determines if two supplied arrays of ints are
    //identical (the same data in the same order).
    //• Parameters: Two arrays of ints
    //• Returns: a boolean
    //Write a JavaDoc for this method.

    /**
     *
     * @param nums1 taking first data that was in supplied arrays for comparing
     * @param nums2 taking the second data that will be compared with the first data
     * @return boolean true if the data both arrays are the same and will return fail if the data or length are not same
     */
    public static boolean isIdentical(int[] nums1, int[] nums2) {

        if (nums1 == null && nums2 == null) {
            return true;
        }
        if (nums1 == null || nums2 == null) {
            return false;
        }
        if (nums1.length != nums2.length) {
            return false;
        }
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                return false;
            }
        }
        return true;
    }
//    Exercise 4:
//    Write a static method called isEqual() in NumberUtils that determines if two supplied arrays of
//    ints contain the same information (this can be in the same or different order). Note: You MAY use Arrays.sort() to carry out this logic. •
//    Parameters: Two arrays of ints
//    •	Returns: a boolean

    /**
     * check weather if the two int arrays contain the same value with the same count and ignoring order
     *
     * @param nums1 first array may be null or may contain value
     * @param nums2 second array may be null or may contain value
     *              the two arrays will be sorted in place using Arrays.sort before comparing
     * @return true if the both array contain the same data or different order, otherwise will be false
     */

    public static boolean isEqual(int[] nums1, int[] nums2) {

        if (nums1 == null && nums2 == null) {
            return true;
        }
        if (nums1 == null || nums2 == null) {
            return false;
        }
        if (nums1.length != nums2.length) {
            return false;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                return false;
            }
        }

        return true;
    }

    //    Write a static method called isSubset() in NumberUtils that determines if the first supplied arrays of ints is a subset of the second
//    supplied array (all data from one array is found somewhere in the other).
//    Note: A subset cannot contain the same number of elements as the original set.
//•	Parameters: Two arrays of ints, (A, B) (your method should check if A is a subset of B)
//•	Returns: a boolean

    /**
     *
     * @param nums1 is subset A that could contain value or null
     * @param nums2 is subset B that could contain value or null
     * @return it will return true if every value in subset A are occurs at least the same frequency otherwise is will be false;
     */
    public static boolean isSubset(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return false;
        }
        if (nums1.length == 0 || nums2.length == 0) {
            return false;
        }
        if (nums1.length >= nums2.length){
            return false;
        }
        return true;
    }
}


