package eCommerceSystem.core;

import eCommerceSystem.entities.concretes.User;

public interface GoogleAuthService {
	void signUp(User user);
	void signIn(User user);
}
