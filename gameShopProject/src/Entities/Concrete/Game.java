package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity {
	private int id;
	private int campaignDiscount; //campaignId yapýp discount'u getirmeyi öðrenince düzelt.
	private String gameName;
	private double price;
	private int unitInStock;
	private String description;
	
	public Game() {

	}
	
	public Game(int id, int campaignDiscount, String gameName, double price, int unitInStock, String description) {
		super();
		this.id = id;
		this.campaignDiscount = campaignDiscount;
		this.gameName = gameName;
		this.price = price;
		this.unitInStock = unitInStock;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPriceAfterDiscount() {
		return this.price - (this.price*this.campaignDiscount/100);
	}

}
