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

    private String GET_BUG_ADMIN = "SELECT sommaire, description, p.libelle as ProjectLib, s.libelle as StatusLib FROM bug b, project p, statut s WHERE b.idprojet = p.id and b.statut=s.id;";
    private String GET_BUG_INFO_FROM_ID = "SELECT sommaire, description FROM bug WHERE id=?;";
    public BugDAO(){

    }

    public ArrayList<BugDTO> getBugAdmin() throws SQLException {
        ArrayList<BugDTO> listBug = new ArrayList<BugDTO>();
        try{
            PreparedStatement statement = connection.prepareStatement(GET_BUG_ADMIN);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                BugDTO bug = new BugDTO();
                bug.setId(resultSet.getString("id"));
                bug.setDescription(resultSet.getString("description"));
                bug.setProject(resultSet.getString("ProjectLib"));
                bug.setSommaire(resultSet.getString("sommaire"));
                bug.setStatus(resultSet.getString("StatusLib"));
                listBug.add(bug);
            }

        } catch (SQLException e) {

        }
        return listBug;
    }

    public BugDTO getinfoBugFromId(String id){
        BugDTO bug = new BugDTO();
        try{
            PreparedStatement statement = connection.prepareStatement(GET_BUG_ADMIN);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                bug.setId(resultSet.getString("id"));
                bug.setDescription(resultSet.getString("description"));
                bug.setSommaire(resultSet.getString("sommaire"));
            }

        } catch (SQLException e) {

        }
        return bug;
    }
}
