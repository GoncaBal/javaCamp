package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface InfoValidationService {
	boolean isValidUserInfo(User user);
	boolean isValidName(User user);
	boolean isValidPassword(User user);
	boolean isExistMail(String mail);
	boolean isNullMail(User user);
	boolean isNullPassword(User user);
	
}
