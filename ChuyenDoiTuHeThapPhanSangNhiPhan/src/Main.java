import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        int num = 100;


        while (num>0) {
            stack.add(num%2);
            num = num/2;
        }

        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.print(stack.get(i));
        }

    }
}
