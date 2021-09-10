package eCommerceAutomation.business.concretes;

import java.util.List;

import eCommerceAutomation.business.abstracts.UserService;
import eCommerceAutomation.business.abstracts.UserValidationService;
import eCommerceAutomation.business.abstracts.VerificationService;
import eCommerceAutomation.dataAccess.abstracts.UserDao;
import eCommerceAutomation.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private VerificationService verificationService;
	private UserValidationService userValidationService;

	public UserManager(UserDao userDao, VerificationService verificationService,
			UserValidationService userValidationService) {
		super();
		this.userDao = userDao;
		this.verificationService = verificationService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void signUp(User user) {
		if (userValidationService.isValidUserInfo(user)) {
			System.out.println("Kullanıcı bilgileri boş geçilemez.");
			return;
		} else if (userValidationService.isValidName(user)) {
			System.out.println("Ad soyad 2 karakterden küçük olamaz.");
			return;
		} else if (userValidationService.isValidPassword(user)) {
			System.out.println("Parola en az 6 karakter olmalı");
			return;
		} else if (userValidationService.isExistMail(user)) {
			System.out.println("Bu mail adresi sistemde kayıtlı!");
			return;
		} else if (!userValidationService.isValidMail(user)) {
			System.out.println("Geçersiz mail adresi!");
			return;
		}
		userDao.signUp(user);
		verificationService.verification("tıkla");
	}

	@Override
	public void signIn(User user) {
		if (userValidationService.isValidMail(user)) {
			System.out.println("Mail boş geçilemez!");
			return;
		}
		else if (userValidationService.isValidPassword(user)) {
			System.out.println("Parola boş geçilemez.");
			return;
		}
		else if (userValidationService.isExistMail(user)) {
			System.out.println("Mail adresi kayıtlı değil! Lütfen kayıt olun.");
			return;
		}
		userDao.signIn(user);
		
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
