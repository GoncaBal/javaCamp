package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.InfoValidationService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.entities.concretes.User;

public class InfoValidationManager implements InfoValidationService {

	UserService userService;

	@Override
	public boolean isValidUserInfo(User user) {
		if (user.getFirstName() == null || user.getLastName() == null || user.geteMail() == null
				|| user.getPassword() == null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean isValidName(User user) {
		if (user.getFirstName().length() <= 2 || user.getLastName().length() <= 2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isValidPassword(User user) {
		if (user.getPassword().length() < 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isExistMail(String mail) {
		for (User user : userService.getAll()) {
			if (user.geteMail() == mail) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isNullMail(User user) {
		if (user.geteMail() == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isNullPassword(User user) {
		if (user.getPassword() == null) {
			return true;
		} else {
			return false;
		}
	}

}
