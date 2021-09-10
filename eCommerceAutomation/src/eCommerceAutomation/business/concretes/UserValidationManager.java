package eCommerceAutomation.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceAutomation.business.abstracts.UserValidationService;
import eCommerceAutomation.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	List<String> mail=new ArrayList<String>(); 
	
	UserValidationService userValidationService;

	public UserValidationManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public boolean isValidUserInfo(User user) {
		if (user.getFirstName() == null || user.getLastName() == null || user.getMailAdress() == null
				|| user.getPassword() == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isValidName(User user) {
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
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
	public boolean isExistMail(User user) {
		if (mail.contains(user.getMailAdress())){
			return true;
		}else {
			mail.add(user.getMailAdress());
		}
		return false;
	}

	@Override
	public boolean isValidMail(User user) {
		if(userValidationService.isValidMail(user)) {
			return true;
		}
		return false;
	}

}
