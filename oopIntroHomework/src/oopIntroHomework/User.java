package oopIntroHomework;

public class User {
	
	public User(int userId,String userName,String userMail,String userPassword) {
		this.userId=userId;
		this.userName=userName;
		this.userMail=userMail;
		this.userPassword=userPassword;
	}
	public User() {	}
	
	int userId;
	String userName;
	String userMail;
	String userPassword;
}
