public class Main {

    public static void main(String[] args) {
	// write your code here
        generate_numbers set1 = new generate_numbers(100,1);
        //generate a shuffled list of numbers from 0 to 99
        generate_numbers set2 = new generate_numbers(100,2);
        //generate 100 random numbers.
        set1.print_array();
        set2.print_array();
        //print the two arrays.
    }
}
