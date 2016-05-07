package co.dmecham.timetracker.model;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by david on 5/2/2016.
 */
public class Task {
    private UUID taskID;
    private String name;
    private String externalID;
    private Collection<TimeEntry> workPerformed;

    public UUID getTaskID() {
        return taskID;
    }

    public void setTaskID(UUID taskID) {
        this.taskID = taskID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public Collection<TimeEntry> getWorkPerformed() {
        return workPerformed;
    }

    public void setWorkPerformed(Collection<TimeEntry> workPerformed) {
        this.workPerformed = workPerformed;
    }
}
