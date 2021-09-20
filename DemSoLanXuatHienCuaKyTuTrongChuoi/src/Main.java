import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "hello holland";

        System.out.println("Enter the character: ");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == input) {
                count++;
            }
        }

        System.out.println("In the string " + s + " has " + count + " word '" + input + "'");



    }
}
