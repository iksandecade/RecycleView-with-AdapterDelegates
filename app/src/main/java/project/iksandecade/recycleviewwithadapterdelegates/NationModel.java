package project.iksandecade.recycleviewwithadapterdelegates;

/**
 * Created by
 * Name         : Ihksan Sukmawan
 * Email        : iksandecade@gmail.com
 * Company      : Meridian.Id
 * Date         : 16/11/16
 * Project      : RecycleViewwithAdapterDelegates
 */

public class NationModel {
    int id;
    String message;
    Boolean isBlack;

    public NationModel(int id, String message, Boolean isBlack) {
        this.id = id;
        this.message = message;
        this.isBlack = isBlack;
    }

    public Boolean getBlack() {
        return isBlack;
    }

    public void setBlack(Boolean black) {
        isBlack = black;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
