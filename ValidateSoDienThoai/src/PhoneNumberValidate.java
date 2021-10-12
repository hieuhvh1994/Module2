import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private Pattern pattern;
    private Matcher matcher;

    private static final String regex = "[(]+[0-9]{2}[)]+[-]+[(]+[0-9]{10}[)]+$";

    public PhoneNumberValidate() {
        pattern = Pattern.compile(regex);

    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
