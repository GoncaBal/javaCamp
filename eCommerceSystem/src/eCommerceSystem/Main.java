package eCommerceSystem;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.InfoValidationManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.business.concretes.VerificationManager;
import eCommerceSystem.core.GoogleAuthManagerAdapter;
import eCommerceSystem.core.GoogleAuthService;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		
		User user = new User();
		user.setId(1);
		user.setFirstName("Gonca");
		user.setLastName("Bal");
		user.seteMail("goncabal@gmail.com");
		user.setPassword("123456");
	
		
	
		UserService userService = new UserManager(new HibernateUserDao(), new InfoValidationManager(),
				new VerificationManager());
		
		GoogleAuthService googleService=new GoogleAuthManagerAdapter();
		googleService.signIn(user);
		userService.signUp(user);

	}

}
