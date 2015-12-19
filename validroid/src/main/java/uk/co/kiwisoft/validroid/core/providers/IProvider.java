package uk.co.kiwisoft.validroid.core.providers;

/**
 * ToDo: Explain the scope of the class
 */
public interface IProvider<T, V> {
    T provideData(V container);
}
