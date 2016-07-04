package uk.co.kiwisoft.validroid;


import java.lang.ref.WeakReference;

import uk.co.kiwisoft.validroid.handlers.IHandler;
import uk.co.kiwisoft.validroid.providers.IProvider;
import uk.co.kiwisoft.validroid.validators.IValidator;

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
    private final IProvider<T, C> dataProvider;

    // The validation that will run over the data.
    private final IValidator<T> validator;

    // Handles errors raised by the validator.
    private final IHandler<C> handler;

    public WorkContainer(C dataContainer,
                         IProvider<T, C> provider,
                         IValidator<T> validator,
                         IHandler<C> handler) {
        this.dataContainer = new WeakReference<C>(dataContainer);
        this.dataProvider = provider;
        this.validator = validator;
        this.handler = handler;
    }

    public C getDataContainer() {
        return dataContainer.get();
    }

    public IProvider<T, C> getDataProvider() {
        return dataProvider;
    }

    public IValidator<T> getValidator() {
        return validator;
    }

    public IHandler<C> getHandler() {
        return handler;
    }
}
