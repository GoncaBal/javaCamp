package gameStoreProject.entities.concretes;

public class User {
		private int id;
		private String mailAdress;
		private String password;
		public User() {
			super();
		}
		public User(int id, String mailAdress, String password) {
			super();
			this.id = id;
			this.mailAdress = mailAdress;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMailAdress() {
			return mailAdress;
		}
		public void setMailAdress(String mailAdress) {
			this.mailAdress = mailAdress;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
