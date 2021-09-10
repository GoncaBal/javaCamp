package eCommerceAutomation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceAutomation.dataAccess.abstracts.UserDao;
import eCommerceAutomation.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users=new ArrayList<User>();
	
	@Override
	public void signUp(User user) {
		System.out.println("Hibernate ile kayıt olundu! " + user.getMailAdress()
				+ " Aktivasyon kodu gönderildi! Kaydınızı tamamlamak için lütfen mailinizi kontrol edin.");
	}

	@Override
	public void signIn(User user) {
		System.out.println("Sisteme giriş yapıldı! Hoşgeldin "+user.getFirstName());
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId()==id) {
				return user;
			} 
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Sisteme kayıtlı mail adresleri: ");
		for (User user : users) {
			System.out.println(user.getMailAdress());
		}
		return users;
	}

}
