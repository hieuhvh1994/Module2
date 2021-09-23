public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(10);
        System.out.println(cylinder);

        cylinder = new Cylinder(10, 5, "Red");
        System.out.println(cylinder);
    }
}
