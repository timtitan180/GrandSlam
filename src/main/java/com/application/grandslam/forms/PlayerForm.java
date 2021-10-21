package com.application.grandslam.forms;

import java.util.Date;

public class PlayerForm {
    private Integer playerId;
    private String name;
    private Integer games;
    private Integer atBats;
    private Integer runs;
    private Integer hits;
    private Integer doubles;
    private Integer triples;
    private Integer homeRuns;
    private Integer runsBattedIn;
    private Integer walks;
    private Integer timesStruckOut;
    private double battingAverage;

    /* Stats for pitchers */
    private Double inningsPitched;
    private Integer homeRunsAllowed;
    private Integer hitsAllowed;
    private Integer walksAllowed;
    private Integer runsAllowed;
    private Integer strikeouts;

    /*Game form*/
    private Integer gameId;
//    private Date gameDate;
    private String gameLocation;

    private double earnedRunAverage;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }


    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getGames() {
        return games;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getHits() {
        return hits;
    }

    public Integer getDoubles() {
        return doubles;
    }

    public void setDoubles(Integer doubles) {
        this.doubles = doubles;
    }

    public Integer getTriples() {
        return triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getRuns() {
        return runs;
    }

    public Integer getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(Integer homeRuns) {
        this.homeRuns = homeRuns;
    }

    public Integer getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(Integer runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }


    public void setTimesStruckOut(Integer timesStruckOut) {
        this.timesStruckOut = timesStruckOut;
    }

    public Integer getTimesStruckOut() {
        return timesStruckOut;
    }

    public Double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(Double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public Integer getHomeRunsAllowed() {
        return homeRunsAllowed;
    }

    public void setHomeRunsAllowed(Integer homeRunsAllowed) {
        this.homeRunsAllowed = homeRunsAllowed;
    }

    public Integer getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(Integer hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public Integer getWalksAllowed() {
        return walksAllowed;
    }

    public void setWalksAllowed(Integer walksAllowed) {
        this.walksAllowed = walksAllowed;
    }

    public Integer getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(Integer runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public double getEarnedRunAverage() {
        return earnedRunAverage;
    }

    public void setEarnedRunAverage(double earnedRunAverage){
        this.earnedRunAverage = earnedRunAverage;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return this.playerId;
    }

    public Integer getGameId() {
        return this.gameId;
    }

//    public void setGameDate(Date gameDate) {
//        this.gameDate = gameDate;
//    }
//
//    public Date getGameDate() {
//        return this.gameDate;
//    }

    public void setGameLocation(String gameLocation) {
        this.gameLocation = gameLocation;
    }

    public String getGameLocation() {
        return this.gameLocation;
    }

//	@Override
//	public String toString() {
//		return "PlayerForm: [" + name + ""  + "" + email + "" +password + "" + confirmPassword
//				+ "]";
//	}
}
