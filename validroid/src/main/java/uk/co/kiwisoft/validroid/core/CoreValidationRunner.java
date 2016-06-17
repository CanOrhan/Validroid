package uk.co.kiwisoft.validroid.core;

import uk.co.kiwisoft.validroid.core.handlers.IHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * A basic implementation of {@see uk.co.kiwisoft.validroid.core.IValidationRunner}
 */
public class CoreValidationRunner implements IValidationRunner {
    private final List<WorkContainer> workPool = new ArrayList<WorkContainer>();

    /**
     * Add a single WorkContainer
     * @param workContainer that will be executed when validate() is called
     */
    public void addWork(WorkContainer workContainer) {
        workPool.add(workContainer);
    }

    /**
     * Add a list of WorkContainers
     * @param workContainers that will be executed when validate() is called
     */
    public void addWork(List<WorkContainer> workContainers) {
        workPool.addAll(workContainers);
    }

    /**
     * Synchronously runs each validation task.
     * @return true if all fields are valid.
     */
    public boolean validate() {
        boolean isEverythingOk = true;
        for (WorkContainer container : workPool) {
            Object input = container.getDataProvider().provideData(container.getDataContainer());
            if (!container.getValidator().isValid(input)) {
                String[] errorMessages = container.getValidator().getErrorMessages();
                IHandler handler = container.getHandler();

                handler.handleErrorMessages(errorMessages);
                isEverythingOk = false;
            }
        }
        return isEverythingOk;
    }
}
