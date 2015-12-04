package main.java.com.DAO.SGBDConnexion;

import java.sql.Connection;

/**
 * Created by Jocelyn on 16/06/2015.
 */
public abstract class AbstractDAO {

    public Connection connection = SGBDConnect.getInstance();

}