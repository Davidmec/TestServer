package co.dmecham.timetracker.services;

import co.dmecham.timetracker.model.Project;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by david on 5/6/2016.
 */
public interface IProjectService {
    public Project find (UUID id);
    public Collection<Project> findAll();
    public Project create(Project item);
    public Project update(UUID id,Project item);
    public boolean delete(UUID id);
    public void deleteAll();
}
