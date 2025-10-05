package ui;
import utils.DataGenerator;
public class Statistics {
    //    Add the following logic to Statistics.java class (this should be added in a main() method):
//•	Create a hard-coded array containing the following: {10, 20, 10, 20, 60, 10, 5, 60, 5, 60}
    //•	Using the code supplied on moodle (getRandomArray() in DataGenerator), generate an array of random ints.
//•	Once this is done, your program should: o Display the contents of both arrays. o Find the largest value in the random array.
// o	Find the position in which this value first appears in the array. o Find the position in which this value last appears in the array.
// o	Determine whether or not the hard-coded and generated arrays are identical, equal or if one is a subset of the other.
    public static void main(String[] args) {

        int[] nums = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        nums = DataGenerator.getRandomArray(10);
    }
}
