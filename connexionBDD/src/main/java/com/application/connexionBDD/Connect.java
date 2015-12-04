package main.java.com.application.connexionBDD;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by Jocelyn on 04/12/2015.
 */
@Path("/bugtracker")
public class Connect {

    @POST
    @Path("/connect")
    public Response connectUser(@PathParam("login") String login, @PathParam("password") String password ) {
        String value = "Hello World";
        return Response.status(200).entity(value).build();
    }
}
