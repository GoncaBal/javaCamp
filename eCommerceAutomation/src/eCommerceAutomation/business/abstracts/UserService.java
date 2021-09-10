package eCommerceAutomation.business.abstracts;

import java.util.List;

import eCommerceAutomation.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	User get(int id);
	List<User> getAll();
}
