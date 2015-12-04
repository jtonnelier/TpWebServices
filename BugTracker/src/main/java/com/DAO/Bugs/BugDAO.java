package main.java.com.DAO.Bugs;

import main.java.com.DAO.SGBDConnexion.AbstractDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class BugDAO extends AbstractDAO {

    private String GET_BUG_ADMIN = "SELECT sommaire, description, libelle FROM bug b, project p WHERE b.idprojet = p.id";
    public BugDAO(){

    }

    public ArrayList<BugDTO> getBugAdmin() throws SQLException {
        ArrayList<BugDTO> listBug = new ArrayList<BugDTO>();
        try{
            PreparedStatement statement = connection.prepareStatement(GET_BUG_ADMIN);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                BugDTO bug = new BugDTO();
                bug.setDescription(resultSet.getString("description"));
                bug.setProject(resultSet.getString("libelle"));
                bug.setSommaire(resultSet.getString("sommaire"));
                listBug.add(bug);
            }

        } catch (SQLException e) {

        }
        return listBug;
    }
}
