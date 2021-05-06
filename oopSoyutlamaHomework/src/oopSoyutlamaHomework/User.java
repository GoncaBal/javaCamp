package oopSoyutlamaHomework;

public class User {
	int id;
	String userName;
	String firstName;
	String lastName;
	String mailadress;
	String password;

	public User() {
	}

	public User(int id, String userName, String firstName, String lastName, String mailadress, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailadress = mailadress;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
