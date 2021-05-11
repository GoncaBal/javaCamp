package gameProject;

public class PlayerManager implements PlayerService{

	private PersonCheckService personCheckService;

	public PlayerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	@Override
	public void createAccount(Player player) {
		if (personCheckService.checkIfRealPerson(player)) {
			System.out.println("Your account has been created successfully.");
		} else {
			System.out.println("Not a valid person!");
		}

	}

	@Override
	public void updateInfo(Player player) {

		System.out.println("Your information has been updated successfully.");

	}

	@Override
	public void deleteAccount(Player player) {

		System.out.println("Your account has been deleted successfully.");
	}



}
