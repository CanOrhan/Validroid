package uk.co.kiwisoft.validroid_examples.validators;

import uk.co.kiwisoft.validroid.core.validators.IValidator;

/**
 * ToDo: Explain the scope of the class
 */
public class LengthValidator implements IValidator<String> {
    public boolean isValid(String input) {
        return input.length() >= 6 && input.length() <= 50;
    }

    public String[] getErrorMessages() {
        return new String[]{"Emails must be between 6 and 50 characters."};
    }
}
