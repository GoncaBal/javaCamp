package eCommerceAutomation.core.utilities;

import eCommerceAutomation.business.abstracts.UserValidationService;
import eCommerceAutomation.entities.concretes.User;
import eCommerceAutomation.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements UserValidationService {

	@Override
	public boolean isValidUserInfo(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidName(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidMail(User user) {
		
		return	GoogleAuthManager.isValidMail(user.getMailAdress());
		
	}

	@Override
	public boolean isValidPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExistMail(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	

	
	}


