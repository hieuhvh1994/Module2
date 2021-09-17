import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of prime numbers: ");
        length = scanner.nextInt();

        int count = 0;
        int N = 2;


        while (count != length) {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(N);
                count++;
            }
            N++;

        }

    }
}
