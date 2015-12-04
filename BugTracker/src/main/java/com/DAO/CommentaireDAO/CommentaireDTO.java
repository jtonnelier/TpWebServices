package main.java.com.DAO.CommentaireDAO;

/**
 * Created by Jocelyn on 04/12/2015.
 */
public class CommentaireDTO {
    private String userName;
    private String comment;

    public CommentaireDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
