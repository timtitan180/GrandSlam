package com.application.grandslam.database.entities;

import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/*import perscholas.database.daos.StatsDao;*/

@Entity
@Table(name = "stats")
public class Stats{

	@ManyToOne
	@JoinColumn(name = "team_id",nullable = false)
	private Team team;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stats_id")
	private Integer statsId;

	@Column(name="name")
	private String name;

	@Column(name="runs")
	private Integer runs;

	@Column(name = "atbat")
	private Integer atBats;

	@Column(name = "hits")
	private Integer hits;

	@Column(name = "2B")
	private Integer doubles;

	@Column(name = "3B")
	private Integer triples;

	@Column(name = "homeruns")
	private Integer homeRuns;

	@Column(name = "runsbattedin")
	private Integer runsBattedIn;

	@Column(name = "walks")
	private Integer walks;
	
	@Column(name="batting_average")
	private Double battingAverage;

	@Column(name = "times_struck_out")
	private Integer timesStruckOut;

	/* Stats for pitchers */
	@Column(name = "innings_pitched")
	private Double inningsPitched;

	@Column(name = "homeruns_allowed")
	private Integer homeRunsAllowed;

	@Column(name = "hits_allowed")
	private Integer hitsAllowed;

	@Column(name = "walks_allowed")
	private Integer walksAllowed;
	
	@Column(name="runs_allowed")
	private Integer runsAllowed;

	@Column(name = "strikeouts")
	private Integer strikeouts;

	@Column(name="earned_runs_average")
	private Double earnedRunAverage;

	public Integer getStatsId() {
		return statsId;
	}

	public void setPlayerId(Integer statsId) {
		this.statsId = statsId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getRuns() {
		return runs;
	}

	public Integer getAtBats() {
		return atBats;
	}

	public void setAtBats(Integer atBats) {
		this.atBats = atBats;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
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

	public Integer getTimesStruckOut() {
		return timesStruckOut;
	}

	public void setTimesStruckOut(Integer timesStruckOut) {
		this.timesStruckOut = timesStruckOut;
	}
	
	public Double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(Double battingAverage) {
		this.battingAverage = battingAverage;
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
	
	public Integer getStrikeouts() {
			return this.strikeouts;
	}
	
	public void setStrikeouts(Integer strikeouts) {
		this.strikeouts = strikeouts;
	}

	public double getEarnedRunAverage() {
		return earnedRunAverage;
	}

    public void setEarnedRunAverage(double earnedRunAverage) {
		this.earnedRunAverage= earnedRunAverage;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Team getTeam() {
		return team;
	}
}

