import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of arrays: ");
        int arr_len = scanner.nextInt();
        System.out.println("Enter the length of elements in array: ");
        int elem_len = scanner.nextInt();

        double[][] a = new double[arr_len][elem_len];

        for (int i =0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.println("Enter value at row " + i + " column " + j + ":");
                int value = scanner.nextInt();
                a[i][j] = value;
            }
        }

        double smallestNum = a[0][0];
        int row = 0;
        int col = 0;

        for (int i=0; i<a.length;i++) {
            for (int j=0; j<a[i].length; j++) {
                if (smallestNum > a[i][j]) {
                    smallestNum = a[i][j];
                    row = i;
                    col = j;

                }
            }

        }

        System.out.println("Smallest number in the array is: " + smallestNum + " at row " + row + " and column " + col);
    }
}
