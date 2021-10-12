public class ClassNameValidateTest {
    public static void main(String[] args) {
        ClassNameValidate classNameValidate = new ClassNameValidate();

        System.out.println(classNameValidate.validate("C0318G"));
        System.out.println(classNameValidate.validate("M0318G"));
        System.out.println(classNameValidate.validate("P0323A"));
    }
}
