package uk.co.kiwisoft.validroid;

/**
 * ToDo: Explain the scope of the class
 */
public interface Validator<T> {
    boolean isValid(T input);
    String[] getErrorMessages();
}
