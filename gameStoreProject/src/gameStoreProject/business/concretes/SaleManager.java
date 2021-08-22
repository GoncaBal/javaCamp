package gameStoreProject.business.concretes;

import gameStoreProject.business.abstracts.SaleService;
import gameStoreProject.entities.concretes.Campaign;
import gameStoreProject.entities.concretes.Game;
import gameStoreProject.entities.concretes.Player;

public class SaleManager implements SaleService {

	
	@Override
	public void sale(Player player,Game game,Campaign campaign) {
		System.out.println(game.getGameName()+" için siparişiniz alındı! Sevgili "+player.getFirstName()+"! "+campaign.getCampaignName()+" kampanyası uygulandı!");
	}

}
