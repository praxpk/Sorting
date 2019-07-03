import java.util.Arrays;

public class MergeSort {

    private int[] array_of_numbers;

    public MergeSort(int[] array1) {
        array_of_numbers = array1;//array that contains the elements to be sorted.
    }

    public void merge_sort() {
        helper_merge_sort(array_of_numbers); //helper method
        System.out.println(Arrays.toString(array_of_numbers)); //printout array.
    }

    private void helper_merge_sort(int[] anArray)
    /**
     * This method is called recursively to divide the array into two halves.
     * The division is done till only one element exists in each sub array.
     * The merge process is then called to merge the two sub arrays in a sorted
     * order.
     */
    {
        if (anArray.length < 2) {
            return; //if the length of array ==1, the array is already sorted so we return.
        }
        int mid = anArray.length / 2; //split the array into two.
        int[] left = new int[mid]; //left subarray
        int[] right = new int[anArray.length - mid]; //right subarray
        System.arraycopy(anArray, 0, left, 0, mid); //copy elements from main array to left subarray.
        System.arraycopy(anArray, mid, right, 0, anArray.length - mid); //copy elements from main array to right subarray.
        helper_merge_sort(left); //further divide the subarrays
        helper_merge_sort(right);
        merge(left, right, anArray); //merge the subarrays in sorted order into the main array
    }

    private void merge(int[] left, int[] right, int[] anArray)
    /**
     * This method is used to merge the two subarrays into the main array in the sorted order.
     */
    {
        int i = 0; //pointer for left subarray
        int j = 0; //pointer for right subarray
        int k = 0; //pointer for main array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                anArray[k] = left[i];
                i++;
                k++;
            } else {
                anArray[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < left.length) {
            anArray[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            anArray[k] = right[j];
            j++;
            k++;
        }

    }
}
