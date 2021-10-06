import java.util.Scanner;

public class RightTriangle {
    double side1;
    double side2;
    double side3;



    public RightTriangle() {
    }

    public RightTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException("Not a Triangle");
        } else {
            throw new IllegalTriangleException("Is a right triangle");
        }
    }



    class IllegalTriangleException extends Exception {
        String errorMessage;

        public IllegalTriangleException(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the second side: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the third side: ");
        double side3 = sc.nextDouble();

        try {
           RightTriangle r = new RightTriangle(side1, side2, side3);

        }  catch (IllegalTriangleException e) {
            System.out.println(e.getErrorMessage());
        }
    }
}
