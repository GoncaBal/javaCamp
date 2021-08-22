package gameStoreProject.business.abstracts;

import gameStoreProject.entities.concretes.Player;

public interface PlayerService {
		void save(Player player);
		void update(Player player);
		void delete(Player player);
}
