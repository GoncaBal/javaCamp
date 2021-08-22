package gameStoreProject.entities.concretes;

public class Campaign extends Game {
		private int id;
		private String campaignName;
		private double discount;
		private int campaignDuration;
		
		public Campaign() {
			super();
		}
		public Campaign(int id, String campaignName, double discount, int campaignDuration) {
			super();
			this.id = id;
			this.campaignName = campaignName;
			this.discount = discount;
			this.campaignDuration = campaignDuration;
		}
		public Campaign(int id, String gameName, double unitPrice) {
			super(id, gameName, unitPrice);
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
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public int getCampaignDuration() {
			return campaignDuration;
		}
		public void setCampaignDuration(int campaignDuration) {
			this.campaignDuration = campaignDuration;
		}
}
