package eCommerceSystem.core;

import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService{
	
	

	@Override
	public void signUp(User user) {
		if(GoogleAuthManager.isEmailValid(user.geteMail())) {
		System.out.println("Sisteme google hesabı ile kayıt olundu. "+ user.geteMail());
		}
		else {
			System.out.println("Hata! Lütfen google hesabı ile kayıt olmayı deneyin.");
		}
	}

	@Override
	public void signIn(User user) {
		if(GoogleAuthManager.isEmailValid(user.geteMail())) {
		System.out.println("Sisteme google hesabı ile giriş yapıldı. "+user.geteMail());
		}
		else {
			System.out.println("Hata! Lütfen google hesabınızla giriş yapmayı deneyin.");
		}
	}

}
