package main.java.com.DAO.ConnexionUtilisateur;

import main.java.com.DAO.SGBDConnexion.AbstractDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class UserConnexionDAO extends AbstractDAO{

    public final String CONNECT_USER = "SELECT mail, mdp from user where mail=? and mdp=?;";
    public UserConnexionDAO(){

    }

    public int connexionUser(String login, String password) throws SQLException {
        int codeRetour = 0;
        try{
            System.out.println("Debut getEmailByID");
            PreparedStatement statement = connection.prepareStatement(CONNECT_USER);
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            String loginFromTable = null;
            String passFromTable = null;


            if (!resultSet.next() ) {
                codeRetour =  404;
            }
            else{
                while (resultSet.next()) {
                    loginFromTable = resultSet.getString("mail");
                    passFromTable = resultSet.getString("mdp");
                }
                if(login.equals(loginFromTable) && password.equals(passFromTable)){
                    codeRetour = 200;
                }
                else{
                    codeRetour = 400;
                }
            }

            return codeRetour;

        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des emails");
            System.out.println(e);
        }
        return codeRetour;
    }
}
