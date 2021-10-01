import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        String input = "deified";

        Queue<Character> queue = new LinkedList<Character>();
        for (int i = input.length()-1; i>=0 ; i--) {
            queue.add(input.charAt(i));

        }

        String strReverse = "";
        while (!queue.isEmpty()) {
            strReverse = strReverse + queue.remove();
        }

        if (input.equals(strReverse)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not Palindrome");
        }




    }
}
