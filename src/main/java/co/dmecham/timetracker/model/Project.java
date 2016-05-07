package co.dmecham.timetracker.model;

import java.util.UUID;

/**
 * Created by david on 5/2/2016.
 */
public class Project {
    private UUID projectID;
    private String name;
    private String description;
    private String externalID;

    public UUID getProjectID() {
        return projectID;
    }

    public void setProjectID(UUID projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public void copyInValues(Project project){
        setProjectID(project.getProjectID());
        setName(project.getName());
        setDescription(project.getDescription());
        setExternalID(project.getExternalID());
    }
}
