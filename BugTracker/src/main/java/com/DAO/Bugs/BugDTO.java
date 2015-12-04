package main.java.com.DAO.Bugs;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class BugDTO {

    private String sommaire;
    private String description;
    private String project;

    public BugDTO() {
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
}
