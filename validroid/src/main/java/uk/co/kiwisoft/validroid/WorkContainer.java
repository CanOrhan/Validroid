package uk.co.kiwisoft.validroid;


import java.lang.ref.WeakReference;

/**
 * Class that contains all the information needed to validate a view.
 *
 * For example C could be an Android TextView. T could be CharacterSequence.
 *
 * @param <C> - The class which contains the data that needs to be validated
 * @param <T> - The type of the data extracted from type C
 */
public class WorkContainer<C, T> {

    // The data container. Can be a view.
    private final WeakReference<C> dataContainer;

    // Provides data of type T from container C.
    private final Provider<T, C> dataProvider;

    // The validation that will run over the data.
    private final Validator<T> validator;

    // Handles errors raised by the validator.
    private final Handler handler;

    public WorkContainer(C dataContainer,
                         Provider<T, C> provider,
                         Validator<T> validator,
                         Handler handler) {
        this.dataContainer = new WeakReference<C>(dataContainer);
        this.dataProvider = provider;
        this.validator = validator;
        this.handler = handler;
    }

    public C getDataContainer() {
        return dataContainer.get();
    }

    public Provider<T, C> getDataProvider() {
        return dataProvider;
    }

    public Validator<T> getValidator() {
        return validator;
    }

    public Handler getHandler() {
        return handler;
    }
}
