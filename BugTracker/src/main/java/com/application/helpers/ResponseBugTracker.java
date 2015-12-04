package main.java.com.application.helpers;

import main.java.com.DAO.Bugs.BugDTO;

import javax.xml.ws.Response;
import java.util.ArrayList;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class ResponseBugTracker {

    //Retour Connexion
    private String connexion;

    //Renvois des bugs
    private ArrayList<BugDTO> bugs = new ArrayList<BugDTO>();

    //Renvois du détail du bug
    private BugDTO detailBug;

    public ResponseBugTracker(){

    }

    public String getConnexion() {
        return connexion;
    }

    public void setConnexion(String connexion) {
        this.connexion = connexion;
    }

    public ArrayList<BugDTO> getBugs() {
        return bugs;
    }

    public void setBugs(ArrayList<BugDTO> bugs) {
        this.bugs = bugs;
    }

    public BugDTO getDetailBug() {
        return detailBug;
    }

    public void setDetailBug(BugDTO detailBug) {
        this.detailBug = detailBug;
    }
}
