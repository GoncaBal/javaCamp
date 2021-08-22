package gameStoreProject.business.abstracts;

import gameStoreProject.entities.concretes.Player;

public interface PersonCheckService {
		boolean checkIfRealPerson(Player player);
		
}
