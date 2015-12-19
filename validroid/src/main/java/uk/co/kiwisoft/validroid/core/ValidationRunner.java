package uk.co.kiwisoft.validroid.core;

import java.util.ArrayList;
import java.util.List;

/**
 * ToDo: Explain the scope of the class
 */
public class ValidationRunner {
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
        for(WorkContainer container : workPool) {
            Object input = container.getDataProvider().provideData(container.getDataContainer());
            if(!container.getValidator().isValid(input)){
                container.getHandler().handleErrorMessages(container.getValidator().getErrorMessages());
                isEverythingOk = false;
            }
        }
        return isEverythingOk;
    }
}
