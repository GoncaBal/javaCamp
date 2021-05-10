package gameProject;

public class User implements Entity {

	private int userId;
	private String mailadress;
	private String password;

	public User() {}

	public User(int userId, String mailadress, String password) {
		super();
		this.userId = userId;
		this.mailadress = mailadress;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMailadress() {
		return mailadress;
	}

	public void setMailadress(String mailadress) {
		this.mailadress = mailadress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}