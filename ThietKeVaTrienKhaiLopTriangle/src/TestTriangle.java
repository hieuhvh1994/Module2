public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(2,3,4);
        System.out.println(triangle);

        triangle = new Triangle(2,3,4, "blue", false);
        System.out.println(triangle);
    }
}
