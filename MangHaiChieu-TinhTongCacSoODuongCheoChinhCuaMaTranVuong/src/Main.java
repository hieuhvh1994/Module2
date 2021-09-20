import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of arrays: ");
        int arr_len = scanner.nextInt();

        double[][] a = new double[arr_len][arr_len];

        for (int i =0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.println("Enter value at row " + i + " column " + j + ":");
                int value = scanner.nextInt();
                a[i][j] = value;
            }
        }

        int total = 0;
        for (int i=0; i< a.length;i++) {
            total += a[i][i];
        }

        System.out.println("The total of the main diagonal is: " + total);
    }
}
