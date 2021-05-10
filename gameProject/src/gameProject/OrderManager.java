package gameProject;

public class OrderManager implements OrderService {
	CampaignService campaignService;
	
	public OrderManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	@Override
	public void buy(Player player, Salesman salesman,Game game) {
		System.out.println(player.getFirstName()+" adlı kullanıcı "+ game.getGameName() +" adlı oyunu satın aldı. İşlemi yapan: "+salesman.getFirstName());
		
	}

	@Override
	public void addToCart(Game game) {
		System.out.println(game.getGameName()+" sepete eklendi. Oyunun ücreti: "+game.getPrice());
		
	}

}
