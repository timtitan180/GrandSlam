package com.application.grandslam.database.entities;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="games")
public class Game {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="game_id")
	private Integer gameId;

	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinTable(name="game_stats")
	Set<Stats> stats;

//	@Column(name="game_date",nullable = true)
//	@DateTimeFormat(pattern="YYYY-MM-DD")
//	private Date gameDate;

	@Column(name="location")
	private String gameLocation;
	
	public Integer getId() {
		return gameId;
	}
	public void setId(Integer gameId) {
		this.gameId = gameId;
	}
//	public Date getGameDate() {
//		return gameDate;
//	}
//	public void setGameDate(Date gameDate) {
//		this.gameDate = gameDate;
//	}
	public String getGameLocation() {
		return gameLocation;
	}

	public void setGameLocation(String gameLocation) {
		this.gameLocation = gameLocation;
	}

	public void setStats(Set<Stats> stats) {
		this.stats = stats;
	}

	public Set<Stats> getStats() {
		return stats;
	}

}
