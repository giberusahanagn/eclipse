package com.xworkz.crud.dto;

public class CarromDTO extends AbstractAuditDTO {

	private int players;
	private String teamName;
	private boolean wins;
	private double price;

	public CarromDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarromDTO [players=" + players + ", teamName=" + teamName + ", wins=" + wins + ", price=" + price + "]";
//		System.out.println(players);
//		System.out.println(teamName);
//		System.out.println(wins);
//		System.out.println(price);
//		return "sahana";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashcode........");
		return super.hashCode();
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setWins(boolean wins) {
		this.wins = wins;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
