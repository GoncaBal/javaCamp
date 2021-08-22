package gameStoreProject.business.concretes;

import gameStoreProject.business.abstracts.PersonCheckService;
import gameStoreProject.business.abstracts.PlayerService;
import gameStoreProject.entities.concretes.Player;

public class PlayerManager implements PlayerService{

	PersonCheckService personCheckService;
	
	public PlayerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Player player) {
		if (personCheckService.checkIfRealPerson(player)) {
			System.out.println("Kayıt olundu! Hoşgeldin  "+player.getFirstName()+" !");
		} else {
System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Bilgiler güncellendi!");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Kayıt silindi.");
		
	}

}
