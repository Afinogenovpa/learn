package learning;

public class Array {
    int[] array;

    Array(int size){
        array = new int[size];
    }

    public int[] fill_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100));
        }
        return array;

    }

    public void print_array(String sort, int[] array){
        System.out.println(sort);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "   ");
        }
        System.out.println();
    }




//    int size;
//    double[] array = new double[size];
//
//    static double[] fill_array(double[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        return arr;
//    }

}
