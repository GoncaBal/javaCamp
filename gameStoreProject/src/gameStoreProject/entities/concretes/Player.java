package gameStoreProject.entities.concretes;

public class Player extends User {
		private int playerId;
		private String firstName;
		private String lastName;
		private int dateOfBirth;
		private String nationalityIdentity;
		public Player() {
			super();
		}
		public Player(int playerId, String firstName, String lastName, int dateOfBirth, String nationalityIdentity) {
			super();
			this.playerId = playerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.nationalityIdentity = nationalityIdentity;
		}
		public int getPlayerId() {
			return playerId;
		}
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
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
		public int getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getNationalityIdentity() {
			return nationalityIdentity;
		}
		public void setNationalityIdentity(String nationalityIdentity) {
			this.nationalityIdentity = nationalityIdentity;
		}
		
}
