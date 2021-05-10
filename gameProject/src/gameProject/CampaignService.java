package gameProject;

public interface CampaignService {
	void addCampaign(Game game,Order order,Campaign campaign);
	void updateCampaign(Game game,Order order);
	void deleteCampaign(Game game, Order order);
}
