package eCommerceSystem.business.concretes;

import java.util.List;
import eCommerceSystem.business.abstracts.InfoValidationService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.abstracts.VerificationService;
import eCommerceSystem.core.EMailValidator;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private InfoValidationService infoValidationService;
	private VerificationService verificationService;

	public UserManager(UserDao userDao,InfoValidationService infoValidationService,VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.infoValidationService=infoValidationService;
		this.verificationService=verificationService;

	}

	@Override
	public void signUp(User user) {

		if (infoValidationService.isValidUserInfo(user)) {
			System.out.println("Bilgilerinizi eksik girdiniz! Zorunlu alanlar boş geçilemez.");
			return;
		} else if (infoValidationService.isValidName(user)) {
			System.out.println("Kullanıcı adı ve ya soyadı 2 karakterden küçük olamaz! Kayıt olma başarısız.");
			return;
		} else if (infoValidationService.isValidPassword(user)) {
			System.out.println("Parola 6 karakterden küçük olamaz!");
			return;
		} else if (!EMailValidator.isEmailValid(user.geteMail())) {
			System.out.println("Mail bilgisi hatalı! Lütfen kontrol edin.");
			return;
		} 
//		else if (infoValidationService.isExistMail(user.geteMail())) {
//			System.out.println("E-mail sistemde kayıtlı! Farklı bir mail adresiyle kaydolun.");
//			return;
//		}
		userDao.signUp(user);
		verificationService.verification();

	}

	@Override
	public void signIn(User user) {
		if (infoValidationService.isNullMail(user)) {
			System.out.println("Hata! Mail boş geçilemez.");
			return;
		} else if (infoValidationService.isNullPassword(user)) {
			System.out.println("Hata! Şifre boş geçilemez.");
			return;
		} 
//			else if (!infoValidationService.isExistMail(user.geteMail())) {
//			System.out.println("Lütfen kayıt olun.");
//			return;
//		}
		userDao.signIn(user);

	}

	@Override
	public List<User> getAll() {

		return userDao.getAll();
	}

	@Override
	public User get(int id) {

		return userDao.get(id);
	}
}
