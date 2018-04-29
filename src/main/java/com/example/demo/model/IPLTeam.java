package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IPLTeam  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long iplTeamId;
	private String iplTeamName;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="player_ipl_id")
	private Player player;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public IPLTeam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIplTeamId() {
		return iplTeamId;
	}
	public void setIplTeamId(Long iplTeamId) {
		this.iplTeamId = iplTeamId;
	}
	public String getIplTeamName() {
		return iplTeamName;
	}
	public void setIplTeamName(String iplTeamName) {
		this.iplTeamName = iplTeamName;
	}

}
