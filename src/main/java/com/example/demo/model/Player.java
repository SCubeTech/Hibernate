package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue
	private Long playerId;
	private String playerName;
	
	@OneToOne(cascade= {CascadeType.ALL})
	private Team team;
	
	@OneToMany(cascade= {CascadeType.ALL},mappedBy="player")
	private List<IPLTeam> iplTeam = new ArrayList<IPLTeam>();
	
	public List<IPLTeam> getIplTeam() {
		return iplTeam;
	}
	public void setIplTeam(List<IPLTeam> iplTeam) {
		this.iplTeam = iplTeam;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	

}
