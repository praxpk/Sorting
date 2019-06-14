import java.util.Arrays;

public class Selection_sort {
    private int[] array_of_numbers;//array that contains the unsorted elements
    public Selection_sort(int[] array){
        array_of_numbers = array;
    } //constructor
    public void selection_sort(){
        /** Check for the smallest number from 0 to n and store it
         * at the first index. Then proceed to look for the second
         * smallest number and store it in the second index.         *
         */
        int temp,least,smallest_index=0; //used to swap, store the smallest number and the index of that number respectively.
        for(int i=0;i<array_of_numbers.length;i++){
            least = array_of_numbers[i];
            for (int j=i;j<array_of_numbers.length;j++){
                if(least>array_of_numbers[j]){
                    least = array_of_numbers[j]; //find the smallest number in the iteration and store it.
                    smallest_index = j;//store the index of that number.
                }
            }
            temp=array_of_numbers[i]; //swap the elements
            array_of_numbers[i]=array_of_numbers[smallest_index];
            array_of_numbers[smallest_index]=temp;

        }
        System.out.println(Arrays.toString(array_of_numbers)); //print the sorted array.
    }

}
