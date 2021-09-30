import java.util.Arrays;
import java.util.Stack;

public class MyGenericStackClient {
    public static void main(String[] args) {
        int[] arr_Integer = {1,2,3,4,5};
        Stack<Integer> stackNumbers = new Stack<Integer>();
        for (int i =0; i< arr_Integer.length;i++) {
            stackNumbers.push(arr_Integer[i]);
        }

        for (int i=0; i<arr_Integer.length; i++) {
            arr_Integer[i] = stackNumbers.pop();
        }

        System.out.println(Arrays.toString(arr_Integer));


        String str = "Dieu Do Phu Thuoc Tinh Hinh Cua Ban!";
        String[] str_arr = str.split("");

        Stack<String> stackString = new Stack<String>();
        for (int i=0; i<str_arr.length; i++) {
            stackString.push(str_arr[i]);
        }

        for (int i=0; i<str_arr.length; i++) {
            str_arr[i] = stackString.pop();
        }

        String newString = String.join("",str_arr);

        System.out.println(newString);

    }
}
