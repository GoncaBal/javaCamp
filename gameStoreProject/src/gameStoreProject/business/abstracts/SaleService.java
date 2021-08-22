package gameStoreProject.business.abstracts;

import gameStoreProject.entities.concretes.Campaign;
import gameStoreProject.entities.concretes.Game;
import gameStoreProject.entities.concretes.Player;

public interface SaleService {
		void sale(Player player,Game game,Campaign campaign); 
}
