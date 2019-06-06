import java.util.Arrays;

/**
 * This class is used to generate random numbers in an array. This array of numbers
 * will be used by the various sorting programs.
 */

public class generate_numbers {
    private int[] array_of_numbers; //the numbers are stored in this array.


    public generate_numbers(int capacity, int option) {
        /**
         * constructor
         * takes in the capacity of the array as an argument along with
         * an option to generate numbers in an order (that are later shuffled)
         * or n random numbers (where n = capacity).
         */

        array_of_numbers = new int[capacity];
        if (option == 1) {
            /**
             * generate n numbers in order and store them in array_of_numbers.
             * n= capacity.
             */
            for (int i = 0; i < capacity; i++) {
                array_of_numbers[i] = i;
            }
            shuffle_numbers(); //these numbers are then shuffled.
        } else if (option == 2) {
            /**
             * generate n random numbers where n=capacity
             */
            for (int i = 0; i < capacity; i++) {
                array_of_numbers[i] = (int) (Math.random() * (Math.pow(10, Math.random() * 10)));
                /**
                 * we generate a random number using Math.random, we then take
                 * a random multiple of 10 (by raising 10 to the power of another
                 * number) and multiply the two to get a random integer.
                 */
            }
        }
    }

    public void shuffle_numbers() {
        /**
         * This method is used to shuffle the ordered numbers in the array.
         */
        int temp = 0;
        for (int i = 0; i < array_of_numbers.length; i++) {
            int random_index = (int) (Math.random() * array_of_numbers.length);
            //take a random index in the range of the length of the array.
            temp = array_of_numbers[i];
            array_of_numbers[i] = array_of_numbers[random_index];
            array_of_numbers[random_index] = temp; //exchange the random index
            //with the number at the ith index.
        }

    }

    public void print_array() {
        /**
         * This method is used to print the array of numbers as a string,
         */
        System.out.println(Arrays.toString(array_of_numbers));
    }
}
