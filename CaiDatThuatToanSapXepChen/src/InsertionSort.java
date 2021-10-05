public class InsertionSort {
    static int[] list = {3, 6, 8, 2, 4, 6, 9, 1, 12};

    public static void insertionSort(int[] arr) {

        int pos, x;
        for (int i = 1; i< arr.length; i++) {
            x = arr[i];
            pos = i;


            while (pos > 0 && x < arr[pos - 1]) {

                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
