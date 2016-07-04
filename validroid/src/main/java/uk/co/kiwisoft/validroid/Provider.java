package uk.co.kiwisoft.validroid;

/**
 * ToDo: Explain the scope of the class
 */
public interface Provider<T, V> {
    T provideData(V container);
}
