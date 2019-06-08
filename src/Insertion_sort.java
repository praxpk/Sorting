import java.util.Arrays;

/**
 * This class is written to sort elements in an array using insertion sort
 * and print the sorted array.
 */
public class Insertion_sort {
    private int[] array_of_numbers; //array where the numbers are stored

    public Insertion_sort(int[] array1)
    /** constructor that takes in the array to be aorted as argument.
     *
     */
    {
        array_of_numbers = array1;
    }

    public void insertion_sort() {
        int j,temp; //initialize j which is internal counter, temp is used in the swap procedure.
        for(int i=1;i<array_of_numbers.length;i++){
            j=i;//assign i to the internal counter
            while(j>0 && (array_of_numbers[j-1]>array_of_numbers[j]))
            //j is decreased from i to 1, with every iteration. The number at jth index
            //is compared to the number at the previous index. if j-1 is bigger than j
            //then they are swapped. This happens till the elements from 0 to j are in order.
            {
                temp = array_of_numbers[j]; //swap
                array_of_numbers[j] = array_of_numbers[j-1];
                array_of_numbers[j-1] = temp;
                j--; //decrement j
            }

        }
        System.out.println(Arrays.toString(array_of_numbers));//print the sorted array.
    }
}
