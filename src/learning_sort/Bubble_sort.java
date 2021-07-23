package learning_sort;


public class Bubble_sort extends Array {


    Bubble_sort(int size) {
        super(size);
    }


    void bubble_sort(){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
