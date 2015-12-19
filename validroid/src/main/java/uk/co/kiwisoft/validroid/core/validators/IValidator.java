package uk.co.kiwisoft.validroid.core.validators;

/**
 * ToDo: Explain the scope of the class
 */
public interface IValidator<T> {
    boolean isValid(T input);
    String[] getErrorMessages();
}
