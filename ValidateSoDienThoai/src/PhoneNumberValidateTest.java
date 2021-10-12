public class PhoneNumberValidateTest {
    public static void main(String[] args) {
        PhoneNumberValidate phoneNumberValidate = new PhoneNumberValidate();

        System.out.println(phoneNumberValidate.validate("(84)-(0978489648)"));
        System.out.println(phoneNumberValidate.validate("(a8)-(22222222)"));
    }
}
