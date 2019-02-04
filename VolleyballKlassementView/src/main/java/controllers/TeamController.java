package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TeamController {
    private String name;
    private List<String> playerList;
    //vergeet dit niet om naar klassen te doen
    private String club;
    private String competition;
    
    public void init(){
        name = "davoc lot heren 1";
        playerList = new ArrayList<>();
        playerList.add("Jelter");
        playerList.add("kevin");
        playerList.add("joren");
        club = "davoc lot";
        competition = "1ste divisie";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<String> playerList) {
        this.playerList = playerList;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }
    
}
