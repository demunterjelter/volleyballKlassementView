package controllers;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class GameController implements Serializable{
    private String plaats;
    //vergeet niet naar klasse te veranderen.
    private String thuisPloeg;//*
    private String uitPloeg;//*
    private String competition;//*
    private Date gameDate;
    private Integer resultaatThuisploeg;
    private Integer resultaatUitploeg;
    
    
    @PostConstruct
    public void init(){
        thuisPloeg = "davoc lot";
        uitPloeg = "leuven";
        competition = "vb-1ste divisie";
        gameDate = new Date();
        resultaatThuisploeg = 3;
        resultaatUitploeg = 0;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getThuisPloeg() {
        return thuisPloeg;
    }

    public void setThuisPloeg(String thuisPloeg) {
        this.thuisPloeg = thuisPloeg;
    }

    public String getUitPloeg() {
        return uitPloeg;
    }

    public void setUitPloeg(String uitPloeg) {
        this.uitPloeg = uitPloeg;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public Integer getResultaatThuisploeg() {
        return resultaatThuisploeg;
    }

    public void setResultaatThuisploeg(Integer resultaatThuisploeg) {
        this.resultaatThuisploeg = resultaatThuisploeg;
    }

    public Integer getResultaatUitploeg() {
        return resultaatUitploeg;
    }

    public void setResultaatUitploeg(Integer resultaatUitploeg) {
        this.resultaatUitploeg = resultaatUitploeg;
    }
    
}
