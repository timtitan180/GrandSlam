package com.application.grandslam.database.entities;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="games")
public class Game {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "game_id")
	private Integer gameId;

	@OneToMany()
	@JoinColumn(name="stats_id")
	Set<Stats> stats;


	@Column(name="game_date")
	@DateTimeFormat(pattern="MM-DD-YYYY")
	private Date gameDate;

	@Column(name = "location")
	private String gameLocation;


	public Integer getId() {
		return gameId;
	}

	public void setId(Integer gameId) {
		this.gameId = gameId;
	}

	public Date getGameDate() {
		return gameDate;
		}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
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
