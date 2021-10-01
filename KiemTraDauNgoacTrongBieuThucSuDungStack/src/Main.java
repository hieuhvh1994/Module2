import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();


        String input = "s * (s – a) * (s – b * (s – c)       ";


        boolean result = true;
        for (int i=0; i<input.length();i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    result = false;
                    break;
                }
            }
        }
        if (stack.isEmpty() && result == true) {
            System.out.println("Valid Brackets!!");
        } else {
            System.out.println("Wrong brackets!");
        }
    }
}
