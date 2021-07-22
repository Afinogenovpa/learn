package learning;


public class Main {
    public static void main(String[] args) {

        Bubble_sort bubbleSort = new Bubble_sort(10);
        bubbleSort.fill_array(bubbleSort.array);
        bubbleSort.print_array("Начальный массив: ", bubbleSort.array);
        bubbleSort.bubble_sort();
        bubbleSort.print_array("Сортировка пузырьком: ", bubbleSort.array);

        System.out.println();

        Stirring_sort stirring_sort = new Stirring_sort(10);
        stirring_sort.fill_array(stirring_sort.array);
        stirring_sort.print_array("Начальный массив: ", stirring_sort.array);
        stirring_sort.stirring_sort();
        stirring_sort.print_array("Сортировка перемешиванием: ", stirring_sort.array);

    }
}
