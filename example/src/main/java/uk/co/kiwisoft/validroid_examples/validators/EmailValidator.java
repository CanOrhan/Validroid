package uk.co.kiwisoft.validroid_examples.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uk.co.kiwisoft.validroid.validators.IValidator;

/**
 * ToDo: Explain the scope of the class
 */
public class EmailValidator implements IValidator<String> {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean isValid(String input) {
        Matcher matcher = EMAIL_PATTERN.matcher(input);
        return matcher.matches();
    }

    public String[] getErrorMessages() {
        return new String[]{"Invalid email address!"};
    }

}
