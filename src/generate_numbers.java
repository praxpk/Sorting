import java.util.Arrays;

public class generate_numbers {
    private int[] array_of_numbers;

    public generate_numbers(int capacity, int option) {
        array_of_numbers = new int[capacity];
        if (option == 1) {
            for (int i = 0; i < capacity; i++) {
                array_of_numbers[i] = i;
            }
            shuffle_numbers();
        } else if(option==2){
            for(int i=0;i<capacity;i++){
                array_of_numbers[i]=(int)(Math.random()*(Math.pow(10,Math.random()*10)));
            }
        }
    }

    public void shuffle_numbers() {
        int temp=0;
        for(int i=0;i<array_of_numbers.length;i++){
            int random_index = (int)(Math.random()*array_of_numbers.length);
            temp = array_of_numbers[i];
            array_of_numbers[i] = array_of_numbers[random_index];
            array_of_numbers[random_index] = temp;
        }

    }

    public void print_array(){
        System.out.println(Arrays.toString(array_of_numbers));
    }
}
