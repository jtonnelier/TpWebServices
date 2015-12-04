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

    /**
     * Appelle a la connexion de l'utilisateur sur le bugtracker
     * @param login
     * @param password
     * @return
     */
    @POST
    @Path("/connect")
    @Produces("application/json")
    public Response connectUser(@QueryParam("login") String login, @QueryParam("password") String password ) {
        ResponseBugTracker responseTracker = connexionHelper.ConnexionUser(login, password);
        String Json = gson.toJson(responseTracker);
        return Response.status(200).entity(Json).build();
    }

    /**
     * REnvois l'ensemble des bugs contenus dans le bugTracker
     * @param login
     * @return
     */
    @POST
    @Path("/bugs")
    @Produces("application/json")
    public Response getBugs(@QueryParam("login") String login ) {
        ResponseBugTracker responseTracker = bugHelper.getBugsAdmin();
        String Json = gson.toJson(responseTracker);
        return Response.status(200).entity(Json).build();
    }

    /**
     * Renvois le détail d'un bug
     * @param id
     * @return
     */
    @POST
    @Path("/bugs/{id}")
    @Produces("application/json")
    public Response getBugsDetail(@PathParam("id") String id ) {
        ResponseBugTracker responseTracker = bugHelper.getBugDetail(id);
        String Json = gson.toJson(responseTracker);
        return Response.status(200).entity(Json).build();
    }
}
