package main.java.com.application.connexionBDD;

import main.java.com.application.helpers.ConnexionHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Jocelyn on 04/12/2015.
 */
@Path("/bugtracker")
public class BugTracker {

    ConnexionHelper connexionHelper = new ConnexionHelper();

    @POST
    @Path("/connect")
    @Produces("application/json")
    public Response connectUser(@PathParam("login") String login, @PathParam("password") String password ) {
        int connexionReturn = connexionHelper.ConnexionUser(login, password);
        return Response.status(200).entity(connexionReturn).build();
    }
}
