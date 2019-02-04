
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class PlayerController implements Serializable{
    private String firstName = "Jelter";
    private String lastName = "Demunter";
    private String dateOfBirth = "1996-08-06";
    private String team_id = "1000";

//    public String player() {
//        return "player.xhtml";
//    }
     @PostConstruct
    public void init() {
         System.out.println("in init methode");
       firstName = "Jelter";
       lastName = "Demunter";
       dateOfBirth = "1996-08-06";
       team_id = "1000";
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }
    
    
}
