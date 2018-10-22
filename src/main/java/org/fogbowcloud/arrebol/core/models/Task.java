package org.fogbowcloud.arrebol.core.models;

import org.fogbowcloud.arrebol.core.models.specification.Specification;

import java.util.List;

public interface Task {
    String getId();

    void setState(TaskState newState);

    List<Command> getAllCommands();

    Specification getSpecification();

    String getUUID();

    void finish();
}
