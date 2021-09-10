package eCommerceAutomation.business.abstracts;


import eCommerceAutomation.entities.concretes.User;

public interface UserValidationService {
	boolean isValidUserInfo(User user);
	boolean isValidName(User user);
	boolean isValidMail(User user);
	boolean isValidPassword(User user);
	boolean isExistMail(User user);
}
