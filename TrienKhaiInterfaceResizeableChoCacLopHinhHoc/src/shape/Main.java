package shape;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(2.0);
        resizeables[1] = new Rectangle(3.0, 4.0);
        resizeables[2] = new Square(5.0);

        for (Resizeable resizeable : resizeables) {
            if (resizeable instanceof Circle) {
                Circle circle = (Circle) resizeable;
                System.out.println(circle);
                circle.resize(20);
                System.out.println(circle);
            } else if (resizeable instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) resizeable;
                System.out.println(rectangle);
                rectangle.resize(30);
                System.out.println(rectangle);
            } else {
                Square square = (Square) resizeable;
                System.out.println(square);
                square.resize(40);
                System.out.println(square);
            }
        }
    }
}
