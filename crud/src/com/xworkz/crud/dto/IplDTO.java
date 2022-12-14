package com.xworkz.crud.dto;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String captainName;
	private boolean ownerAlive;
	private double purse;
	private int wins;
	private int defeats;

	public IplDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive
				+ ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

}
