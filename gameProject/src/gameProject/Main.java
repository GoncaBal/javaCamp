package gameProject;

public class Main {

	public static void main(String[] args) {
		
		PersonCheckService playerCheckService=new MernisServiceAdapter();
		Salesman salesman=new Salesman();
		salesman.setFirstName("Reyhan");
		Player player=new Player();
		player.setDateOfYear(1994);
		player.setFirstName("Gonca");
		player.setLastName("Bal");
		player.setNationalIdentity("13131313133");
		player.setUserId(1);
		player.setPlayerId(1);
		player.setMailadress("goncabal@gmail.com");
		player.setPassword("1234");
		PlayerManager playerManager=new PlayerManager(playerCheckService);
		playerManager.createAccount(player);
		UserManager userManager=new UserManager();
		userManager.signIn(player);
		userManager.signIn(salesman);
				
		Game game=new Game();
		game.setGameId(1);
		game.setGameName("Legendary");
		game.setPrice(100);
		
		Order order=new Order();
		order.setGameId(1);
		order.setOrderId(1);
		
		
		Campaign campaign=new Campaign();	
		campaign.setCampaignName("Bahar İndirimi");
		campaign.setDiscount(20);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(game, order,campaign);
		
		OrderManager orderManager=new OrderManager(campaignManager);
		orderManager.buy(player, salesman, game);
		
		
		
	}

}
