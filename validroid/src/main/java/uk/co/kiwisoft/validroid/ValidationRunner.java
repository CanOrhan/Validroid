package uk.co.kiwisoft.validroid;

import java.util.List;

/**
 * Interface to create validation runners
 */
public interface ValidationRunner {
    void addWork(WorkContainer workContainer);

    void addWork(List<WorkContainer> workContainers);

    boolean validate();
}
