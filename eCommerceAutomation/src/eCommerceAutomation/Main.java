package eCommerceAutomation;

import eCommerceAutomation.business.concretes.UserManager;
import eCommerceAutomation.business.concretes.UserValidationManager;
import eCommerceAutomation.business.concretes.VerificationManager;
import eCommerceAutomation.core.utilities.GoogleAuthManagerAdapter;
import eCommerceAutomation.dataAccess.concretes.HibernateUserDao;
import eCommerceAutomation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Gonca", "Bal", "goncabal94@gmail.com", "123456");
		User user2 = new User(2, "Reyhan", "Bal", "goncabal9@gmail.com", "1234567");

		UserManager userManager = new UserManager(new HibernateUserDao(), new VerificationManager(),
				new UserValidationManager(new GoogleAuthManagerAdapter()));
		userManager.signUp(user);
		userManager.signUp(user2);

	}

}
