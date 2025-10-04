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
//    Exercise 2:
//    Write a static method called getLastPos() in NumberUtils that finds the last position of a supplied int in an array.
//    • Parameters: An array of ints and a single int
//    • Returns: an int (the position)
public static int getLastPos(int[] nums, int lastPosition) {
    for (int i = nums.length -1; i >= 0; i--){
        if (nums[i] == lastPosition){
            return i;
        }
        }
return -1;
    }
}


