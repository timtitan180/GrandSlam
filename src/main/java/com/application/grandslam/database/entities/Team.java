package com.application.grandslam.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="team_id")
	private Integer teamId;

	@OneToMany(mappedBy = "team")
	private Set<Stats> stats;

	@Column(name="teamName")
	private String teamName;
	
	@Column(name="numberofPlayers")
	private Integer numberofPlayers;
	
	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getNumberofPlayers() {
		return numberofPlayers;
	}

	public void setNumberofPlayers(Integer numberofPlayers) {
		this.numberofPlayers = numberofPlayers;
	}

	public Integer getId() {
		return this.teamId;
	}
}

