package co.dmecham.jersey;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by david on 5/2/2016.
 */

@Path("/TimeEntry")
public class TimeEntryEndpoint {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name")String name){
        return "hello: "+name;
    }
}
