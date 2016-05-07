package co.dmecham.timetracker.services;

import co.dmecham.timetracker.model.Project;
import co.dmecham.timetracker.repositories.SimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by david on 5/6/2016.
 */
public class ProjectServiceImpl implements IProjectService{
    @Autowired
    SimpleRepository<Project> projectRepository;

    @Override
    public Project find(UUID id) {
        return projectRepository.find(id);
    }

    @Override
    public Collection<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project create(Project item) {
        if(item.getProjectID()==null){
            item.setProjectID(UUID.randomUUID());
        }
        return projectRepository.update(item.getProjectID(),item);
    }

    @Override
    public Project update(UUID id, Project item) {
        return projectRepository.update(id,item);
    }

    @Override
    public boolean delete(UUID id) {
        return projectRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        projectRepository.deleteAll();
    }
}
