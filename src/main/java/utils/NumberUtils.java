package utils;

public class NumberUtils {
    //Exercise 1:
    //Write a static method called getPos() in NumberUtils that finds the first position of a supplied int in an array.
    //• Parameters: An array of ints and a single int
    //• Returns: an int (the position)
    //Write a JavaDoc for this method.

    /**
     * @param nums the array to searched
     * @param pos the position that looking for
     * @return the first position of a supplied int in an array
     */
    public static int getPos(int[] nums, int pos) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pos){
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
     * @param nums the array to be seached from input
     * @param lastPosition looking for value that will be the last position
     * @return the last position of an array that have in supplied
     */
    public static int getLastPos(int[] nums, int lastPosition) {
    for (int i = nums.length -1; i >= 0; i--){
        if (nums[i] == lastPosition){
            return i;
        }
        }
return -1;
    }
}


