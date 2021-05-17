package eCommerceSystem.business.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	List<User> getAll();
	User get(int id);
}
