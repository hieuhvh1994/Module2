public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(3.0, 4.0);
        shapes[2] = new Square(5.0);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
