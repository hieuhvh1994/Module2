public class InsertionSort {
    static int[] list = {3, 6, 8, 2, 4, 6, 9, 1, 12};

    public static void insertionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int pos, x;
        for (int i = 1; i< arr.length; i++) {
            x = arr[i];
            pos = i;
            System.out.println();
            System.out.println("x = " + x);
            System.out.println("pos = " + i);

            if (x >= arr[pos -1]) {
                System.out.println("Array at the position " + pos + " is larger than the position at " + (pos-1) + " so we don't swap");
            }

            while (pos > 0 && x < arr[pos - 1]) {

                arr[pos] = arr[pos-1];
                System.out.println();
                System.out.println("Get array at position " + pos + " to the value: " + arr[pos-1]);
                System.out.println();
                for (int h = 0; h<arr.length; h++) {
                    System.out.print(arr[h] + " ");
                }
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
