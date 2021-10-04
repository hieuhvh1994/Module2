import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(12);
        arr.add(68);
        arr.add(23);
        arr.add(40);
        arr.add(38);
        Comparator<Integer> sort = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1> o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        arr.sort(sort);
        System.out.println(arr);


        System.out.println(binarySearch(arr, 0, arr.size()-1, 38));

    }

    public static int binarySearch(ArrayList array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if ((int)array.get(middle) == (value)) {
                return middle;
            } else if ((int) array.get(middle) < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;

    }
}
