package main.java.com.application.helpers;

import main.java.com.DAO.ConnexionUtilisateur.UserConnexionDAO;

import java.sql.SQLException;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class ConnexionHelper {

    private UserConnexionDAO users = new UserConnexionDAO();
    private ResponseBugTracker response = new ResponseBugTracker();

    public ResponseBugTracker ConnexionUser(String login, String password){
        int codeConnexion = 0;

        try {
            codeConnexion = users.connexionUser(login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(codeConnexion == 200){
            response.setConnexion("Ok");
        }
        else{
            response.setConnexion("Ko");
        }

        return response;
    }
}
