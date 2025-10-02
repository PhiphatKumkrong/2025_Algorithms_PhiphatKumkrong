package utils;

public class NumberUtils {
    //Exercise 1:
    //Write a static method called getPos() in NumberUtils that finds the first position of a supplied int in an array.
    //• Parameters: An array of ints and a single int
    //• Returns: an int (the position)
    //Write a JavaDoc for this method.
    public static int getPos(int[] nums, int pos) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pos){
                return i;
            }
        }
        return -1;
    }
    }

