package co.dmecham.timetracker.repositories;

import co.dmecham.timetracker.model.Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Stream;


/**
 * Created by david on 5/2/2016.
 */
public class ProjectRepository implements SimpleRepository<Project>{
    Collection<Project> projects;


    public ProjectRepository(){
        projects = new ArrayList<Project>();
        projects.add(new Project(){{
                setProjectID(UUID.fromString("b6223ff2-1070-11e6-a148-3e1d05defe78"));
                setDescription("This is a test");
                setExternalID("http://www.trello.com/whatever");
                setName("This is the Name to end all names");
            }});
    }
    @Override
    public Project find(UUID id) {
        Stream<Project> proj = projects.stream()
                .filter(pro -> pro.getProjectID().equals(id));
        return proj.findAny().orElse(null);
    }
    @Override
    public Collection<Project> findAll(){
        return projects;
    }
    @Override
    public Project update(UUID contextID,Project project){
        //If a projectID, was set on the UpdateTemplate, and it does not match, the context, then we have an issue
        if(project.getProjectID()!=null && !project.getProjectID().equals(contextID)){
            throw new IllegalArgumentException("Provided ID of: "+contextID +" does not match set object id of: "+project);
        }
        Project prev = find(contextID);
        if(prev == null){
            projects.add(project);
            prev = project;
        }else{
            prev.copyInValues(project);
        }
        return prev;
    }

    @Override
    public boolean delete(UUID id){
        return projects.removeIf(a -> a.getProjectID().equals(id));
    }

    @Override
    public void deleteAll(){
        projects.clear();
    }
}
