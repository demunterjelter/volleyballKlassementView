package controllers;

import java.io.Console;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author demun
 */
@Named
@ApplicationScoped
public class ClubController implements Serializable {
    private String competitieNaam;
    private String regio;
    private String divisie;
    private String club;
    private String teamNaam;
    
     @PostConstruct
    public void init() {
        competitieNaam = "vb 1ste divisie";
        regio = "vlaams-brabant";
        divisie = "1ste divisie";
        club= "davoc lot";
        teamNaam = "davoc lot heren1";
    }
    
   

    public String getCompetitieNaam() {
        return competitieNaam;
    }

    public void setCompetitieNaam(String competitienaam) {
        this.competitieNaam = competitienaam;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public String getDivisie() {
        return divisie;
    }

    public void setDivisie(String divisie) {
        this.divisie = divisie;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }
    
    
    
}
