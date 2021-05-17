package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDao {
	void signUp(User user);
	void signIn(User user);
	User get(int id);
	List<User> getAll();
}
