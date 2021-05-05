package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private int discount;
	private boolean status;
	
	public Campaign() {

	}

	public Campaign(int id, String campaignName, int discount, boolean status) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
