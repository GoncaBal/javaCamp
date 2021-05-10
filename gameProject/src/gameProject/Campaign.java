package gameProject;

public class Campaign implements Entity {
	private int campaignId;
	private int orderId;
	private int gameId;
	private String campaignName;
	
	private double discount;
	 double totalPrice;
	
	public Campaign() {}
	
	public Campaign(int campaignId, int orderId, int gameId, String campaignName, double unitPrice, double discount,
			double totalPrice) {
		super();
		this.campaignId = campaignId;
		this.orderId = orderId;
		this.gameId = gameId;
		this.campaignName = campaignName;
		
		this.discount = discount;
		
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	

}
