package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class CompetitionController implements Serializable {
    private String name;
    private String division;
    private String region;
    //vergeet niet dit naar de klassen te zetten
    private List<String> teamList;
    private List<String> GameList;
    
    @PostConstruct
    public void init(){
        name = "vb-1ste divisie";
        division = "1ste divisie";
        region = "Vlaams-Brabant";
        teamList = new ArrayList<>();
        teamList.add("davoc lot");
        teamList.add("keerberen");
        teamList.add("leuven");
        
        GameList = new ArrayList<>();
        GameList.add("game1");
        GameList.add("game2");
        GameList.add("game3");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<String> teamList) {
        this.teamList = teamList;
    }

    public List<String> getGameList() {
        return GameList;
    }

    public void setGameList(List<String> GameList) {
        this.GameList = GameList;
    }
    
    
    
}
