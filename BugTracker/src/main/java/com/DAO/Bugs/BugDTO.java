package main.java.com.DAO.Bugs;

import main.java.com.DAO.CommentaireDAO.CommentaireDTO;

import java.util.ArrayList;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class BugDTO {

    private String id;
    private String sommaire;
    private String description;
    private String project;
    private String status;
    private ArrayList<CommentaireDTO> commentaires;

    public BugDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        project = project;
    }

    public String getSommaire() {

        return sommaire;
    }

    public void setSommaire(String sommaire) {
        this.sommaire = sommaire;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<CommentaireDTO> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(ArrayList<CommentaireDTO> commentaires) {
        this.commentaires = commentaires;
    }
}
