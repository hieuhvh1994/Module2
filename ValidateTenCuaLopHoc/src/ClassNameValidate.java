import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4}[GHIKLM]$";

    public ClassNameValidate() {
        pattern = Pattern.compile(CLASS_REGEX);

    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
