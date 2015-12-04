package main.java.com.application.BugTracker;

import main.java.com.application.helpers.BugHelper;
import main.java.com.application.helpers.ConnexionHelper;
import main.java.com.application.helpers.ResponseBugTracker;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Jocelyn on 04/12/2015.
 */
@Path("/bugtracker")
public class BugTracker {

    ConnexionHelper connexionHelper = new ConnexionHelper();
    BugHelper bugHelper = new BugHelper();
    Gson gson = new Gson();

    @POST
    @Path("/connect")
    @Produces("application/json")
    public Response connectUser(@QueryParam("login") String login, @QueryParam("password") String password ) {
        ResponseBugTracker responseTracker = connexionHelper.ConnexionUser(login, password);
        String Json = gson.toJson(responseTracker);
        return Response.status(200).entity(Json).build();
    }

    @POST
    @Path("/bugs")
    @Produces("application/json")
    public Response getBugs(@QueryParam("login") String login ) {
        ResponseBugTracker responseTracker = bugHelper.getBugsAdmin();
        String Json = gson.toJson(responseTracker);
        return Response.status(200).entity(Json).build();
    }
}
