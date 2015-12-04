package main.java.com.DAO.CommentaireDAO;

import main.java.com.DAO.Bugs.BugDTO;
import main.java.com.DAO.SGBDConnexion.AbstractDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class CommentaireDAO extends AbstractDAO {

    private String GET_COMMENT_FORM_ID_BUG = "SELECT comment, nom, prenom from comment c, user u WHERE c.idUser = u.id;";
    public CommentaireDAO() {
    }

    public ArrayList<CommentaireDTO> getCommentOfBug(String id){
        ArrayList<CommentaireDTO> commentaires = new ArrayList<CommentaireDTO>();
        try{
            PreparedStatement statement = connection.prepareStatement(GET_COMMENT_FORM_ID_BUG);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CommentaireDTO commentaire = new CommentaireDTO();
                commentaire.setComment(resultSet.getString("comment"));
                commentaire.setUserName(resultSet.getString("prenom") + resultSet.getString("nom"));
            }

        } catch (SQLException e) {

        }
        return commentaires;
    }
}
