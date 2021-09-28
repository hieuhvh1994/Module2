import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Equilateral Triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Isosceles Triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testRegularTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Regular Triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testNotTriangle1() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testNotTriangle2() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testNotTriangle3() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }

}