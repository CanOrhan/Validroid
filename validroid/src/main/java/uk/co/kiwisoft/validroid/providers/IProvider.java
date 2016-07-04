package uk.co.kiwisoft.validroid.providers;

/**
 * ToDo: Explain the scope of the class
 */
public interface IProvider<T, V> {
    T provideData(V container);
}
