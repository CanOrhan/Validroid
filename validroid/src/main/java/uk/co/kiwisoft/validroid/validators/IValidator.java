package uk.co.kiwisoft.validroid.validators;

/**
 * ToDo: Explain the scope of the class
 */
public interface IValidator<T> {
    boolean isValid(T input);
    String[] getErrorMessages();
}
