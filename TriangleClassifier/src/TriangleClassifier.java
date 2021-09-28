public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        String result = "";
        if (a+b > c && a+c>b && b+c>a && a>0 && b>0 && c>0) {
            if (a == b && b == c) {
                result = "Equilateral Triangle";
            } else if (a==b || a==c || b==c) {
                result = "Isosceles Triangle";
            } else {
                result = "Regular Triangle";
            }
        } else {
            result = "Not a triangle";
        }

        return result;
    }
}
