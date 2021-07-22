package learning;


public class Main {
    public static void main(String[] args) {

        Bubble_sort bubbleSort = new Bubble_sort(10);
        bubbleSort.fill_array(bubbleSort.array);
        bubbleSort.print_array("Сортировка пузырьком: ", bubbleSort.array);
        bubbleSort.bubble_sort();
        bubbleSort.print_array("Сортировка пузырьком: ", bubbleSort.array);

        System.out.println();

        Stirring_sort stirring_sort = new Stirring_sort(10);
        stirring_sort.fill_array(stirring_sort.array);
        stirring_sort.print_array("Сортировка перемешиванием: ", stirring_sort.array);
        stirring_sort.stirring_sort();
        stirring_sort.print_array("Сортировка перемешиванием: ", stirring_sort.array);






    }
}



//
//
//    static double[] stirring_sort(double[] arr) {
//        int low = 0;
//        double tmp = 0;
//        int high = arr.length - 1;
//        while (low < high) {
//            for (int i = 0; i < arr.length -1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    tmp = arr[i + 1];
//                    arr[i + 1] = arr[i];
//                    arr[i] = tmp;
//                }
//
//            }
//            high -= 1;
//            for (int j = arr.length - 1; j > 0; j--) {
//                if (arr[j] < arr[j - 1]) {
//                    tmp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//            low+=1;
//        }
//        return arr;
//    }
//}






