package main.java.com.application.helpers;

import main.java.com.DAO.ConnexionUtilisateur.UserConnexionDAO;

import java.sql.SQLException;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class ConnexionHelper {

    private UserConnexionDAO users = new UserConnexionDAO();

    public int ConnexionUser(String login, String password){
        int codeConnexion = 0;
        try {
            codeConnexion = users.connexionUser(login, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return 500;
        }
        return codeConnexion;
    }
}
