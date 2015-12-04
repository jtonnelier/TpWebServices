package main.java.com.application.helpers;

import main.java.com.DAO.Bugs.BugDAO;
import main.java.com.DAO.Bugs.BugDTO;
import main.java.com.DAO.CommentaireDAO.CommentaireDAO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class BugHelper {

    private BugDAO bugs = new BugDAO();
    private CommentaireDAO commentaires = new CommentaireDAO();
    private ResponseBugTracker response = new ResponseBugTracker();

    public ResponseBugTracker getBugsAdmin() {
        //Verification utilisateur manquante
        ArrayList<BugDTO> bugsList = new ArrayList<BugDTO>();
        try {
            response.setBugs(bugs.getBugAdmin());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return response;

    }

    public ResponseBugTracker getBugDetail(String bugId){
        BugDTO bug = bugs.getinfoBugFromId(bugId);
        bug.setCommentaires(commentaires.getCommentOfBug(bugId));
        response.setDetailBug(bug);

        return response;
    }
}
