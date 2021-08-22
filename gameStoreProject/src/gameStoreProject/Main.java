package gameStoreProject;

import gameStoreProject.business.concretes.CampaignManager;
import gameStoreProject.business.concretes.PlayerManager;
import gameStoreProject.business.concretes.SaleManager;
import gameStoreProject.core.adapters.MernisServiceAdapter;
import gameStoreProject.entities.concretes.Campaign;
import gameStoreProject.entities.concretes.Game;
import gameStoreProject.entities.concretes.Player;
import gameStoreProject.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		SaleManager saleManager=new SaleManager();
		CampaignManager campaignManager=new CampaignManager();

		Player player = new Player(1, "Gonca", "Bal", 1994, "13513513535");

		playerManager.save(player);
		
		Game game=new Game(1, "Stardew Valley", 50);
		Sale sale=new Sale(1,1);
	;
		
		
		Campaign campaign =new Campaign(1, "Yaz indirimi", 20, 3);
		campaignManager.add(campaign);
		
		saleManager.sale(player,game,campaign);
	}

}
