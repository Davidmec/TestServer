package co.dmecham.timetracker.model;

import java.util.UUID;

/**
 * Created by david on 5/2/2016.
 */
public class Permission {
    private UUID subjectID;
    private UUID objectID;
    private Permission permission;

    public UUID getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(UUID subjectID) {
        this.subjectID = subjectID;
    }

    public UUID getObjectID() {
        return objectID;
    }

    public void setObjectID(UUID objectID) {
        this.objectID = objectID;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
