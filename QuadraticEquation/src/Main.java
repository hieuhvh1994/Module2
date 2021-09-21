import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation rect1 = new QuadraticEquation(a,b,c);

        double x = -b/(2*a);

        if (rect1.getDiscriminant() <0) {
            System.out.println("The equation has no roots");
        } else if (rect1.getDiscriminant() == 0) {

            System.out.println("The equation has 1 root: " + x);
        } else {
            System.out.println("The equation has 2 roots " + rect1.getRoot1() + " and " + rect1.getRoot2());
        }


    }
}
