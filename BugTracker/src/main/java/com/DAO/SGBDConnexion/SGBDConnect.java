package main.java.com.DAO.SGBDConnexion;

import java.sql.*;
import java.util.logging.Logger;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class SGBDConnect {

    /**
     * URL de connection
     */
    private static String url = "jdbc:mysql://localhost:3306/webservice";
    /**
     * Nom du user
     */
    private static String user = "root";
    /**
     * Mot de passe du user
     */
    private static String passwd = "";
    /**
     * Objet Connection
     */
    private static Connection connect;

    /**
     * M�thode qui va nous retourner notre instance
     * et la cr�er si elle n'existe pas...
     * @return
     */

    public static Connection getInstance(){
        if(connect == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection(url, user, passwd);
                //getInformationConnectivity();
            } catch (SQLException e) {
            } catch (ClassNotFoundException e) {
            }
        }
        return connect;
    }

    public static void getInformationConnectivity(){
        DatabaseMetaData md = null;
        try {
            md = connect.getMetaData();
            ResultSet rs = md.getTables(null, null, "%", null);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("Connexion non valide");
        }
    }
}
