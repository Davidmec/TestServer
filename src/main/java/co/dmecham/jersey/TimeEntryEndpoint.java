package co.dmecham.jersey;



import co.dmecham.jersey.repository.Repository;
import co.dmecham.model.Project;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.UUID;

/**
 * Created by david on 5/2/2016.
 */

@Path("/TimeEntry")
public class TimeEntryEndpoint {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name")String name){
        Project known  = Repository.project.find(UUID.fromString("b6223ff2-1070-11e6-a148-3e1d05defe78"));
        Project unKnown = Repository.project.find(UUID.fromString("b6223ff2-1070-11e6-a148-3e1d05defe79"));

        return "hello: "+name;
    }
}
