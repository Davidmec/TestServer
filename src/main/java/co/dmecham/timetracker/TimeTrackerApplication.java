package co.dmecham.timetracker;

import co.dmecham.timetracker.resources.ProjectsResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by david on 5/4/2016.
 */
public class TimeTrackerApplication extends ResourceConfig {
//    http://www.codingpedia.org/ama/tutorial-rest-api-design-and-implementation-in-java-with-jersey-and-spring/
    public TimeTrackerApplication(){
        //register filters
        register(RequestContextFilter.class);

        //register resources
        register(ProjectsResource.class);


        //register features
        register(JacksonFeature.class);
    }
}
