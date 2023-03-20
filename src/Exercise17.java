import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Exercise17 {
    public void sortingArray() {
        //Numeric array
        int[] numberArray = {89, 96, 63, 47, 21, 32};
        System.out.println("Original numeric array : " + Arrays.toString(numberArray));
        Arrays.sort(numberArray);
        System.out.println("Sorted numeric array : " + Arrays.toString(numberArray));

        //String array
        String[] nameArray = {"London", "Liverpool", "Birmingham", "Leicester", "Newcastle", "Manchester"};
        System.out.println("Original numeric array : " + Arrays.toString(nameArray));
        Arrays.sort(nameArray);
        System.out.println("Sorted string array : " + Arrays.toString(nameArray));

    }

    public static void main(String[] args) {
        Exercise17 obj = new Exercise17();
        obj.sortingArray();
    }


}
