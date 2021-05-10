package gameProject;

public class UserManager implements UserService {

	@Override
	public void signIn(User user) {
		System.out.println("Login successful");
	}

}
