import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element which is needed to be deleted: ");
        int X = input.nextInt();

        int index_del = -1;

        for (int i  = 0; i< arr.length; i++) {
            if (X == arr[i]) {
                index_del = i;
            }
        }


        if (index_del == -1 ) {
            System.out.println(X + " is not in the array!!");
        } else {
            System.out.println(X + " is deleted!!");

            int[] new_arr = new int[arr.length-1];

            for (int j=0; j<index_del; j++) {
                new_arr[j] = arr[j];
            }

            for (int k = index_del; k<arr.length - 1; k++ ) {
                new_arr[k] = arr[k +1];
            }

            for (int l = 0; l<new_arr.length; l++) {
                System.out.print(new_arr[l] + "\t");
            }
        }



    }
}
