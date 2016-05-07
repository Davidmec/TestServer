package co.dmecham.timetracker.resources;

import co.dmecham.timetracker.model.Project;
import co.dmecham.timetracker.services.IProjectService;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.UUID;

/**
 * Created by david on 5/3/2016.
 **/
@Component()
@Path("/Projects")
public class ProjectsResource {


    @Autowired
    private IProjectService projectService;

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Response createProject(Project project){
        if(project.getProjectID()!=null && projectService.find(project.getProjectID())!=null){
                return Response.status(Response.Status.CONFLICT).build();
        }else {
            projectService.create(project);
            return Response.status(Response.Status.CREATED)
                    .entity(project)
                    .header("Location", "http://localhost:8080/rest/Projects/" + project.getProjectID())
                    .build();
        }
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Collection<Project> getProjects(){
        return projectService.findAll();
    }

    @DELETE
    public Response deleteProjects(){
        projectService.deleteAll();
        return Response.status(Response.Status.NO_CONTENT)// 204
                .entity("All projects have been successfully removed").build();
    }

    @POST
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response createProject(@PathParam("id")UUID id,Project project){
        project.setProjectID(id);
        if(project.getProjectID()!=null && projectService.find(project.getProjectID())!=null){
            return Response.status(Response.Status.CONFLICT).build();
        }else {
            projectService.create(project);
            return Response.status(Response.Status.CREATED)
                    .entity(project)
                    .header("Location", "http://localhost:8080/rest/Projects/" + project.getProjectID())
                    .build();
        }
    }
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Project getProject(@PathParam("id")UUID id){
        return projectService.find(id);
    }

    @PUT
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Project updateProject(@PathParam("id")UUID id,Project project){
        return projectService.update(id,project);
    }

    @DELETE
    @Path("/{id}")
    public Response deleteProject(@PathParam("id")UUID id){
        return Response.status(Response.Status.NO_CONTENT)// 204
                .entity("project successfully removed from database").build();
    }
}
