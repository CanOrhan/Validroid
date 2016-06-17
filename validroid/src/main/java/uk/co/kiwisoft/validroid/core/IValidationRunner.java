package uk.co.kiwisoft.validroid.core;

import java.util.List;

/**
 * Interface to create validation runners
 */
public interface IValidationRunner {
    void addWork(WorkContainer workContainer);

    void addWork(List<WorkContainer> workContainers);

    boolean validate();
}
