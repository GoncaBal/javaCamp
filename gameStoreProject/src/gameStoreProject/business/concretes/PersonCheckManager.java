package gameStoreProject.business.concretes;

import gameStoreProject.business.abstracts.PersonCheckService;
import gameStoreProject.entities.concretes.Player;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}
	
}
