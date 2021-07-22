package learning;

public class Stirring_sort extends Array{

    Stirring_sort(int size) {
        super(size);
    }

    public void stirring_sort(){
        int low = 0;
        int tmp = 0;
        int high = array.length - 1;
        while (low < high) {
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }

            }
            high -= 1;
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            low+=1;
        }
    }
    }

