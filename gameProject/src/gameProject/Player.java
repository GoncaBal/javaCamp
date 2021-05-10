package gameProject;

public class Player extends User implements Entity {
	private int playerId;
	private String nationalIdentity;
	private String firstName;
	private String lastName;
	private int dateOfYear;

	public Player() {
		super();
	}

	public Player(int userId, int playerId, String mailadress, String password, String nationalIdentity,
			String firstName, String lastName, int dateOfYear) {
		super(userId, mailadress, password);
		this.playerId = playerId;
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfYear() {
		return dateOfYear;
	}

	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}

}