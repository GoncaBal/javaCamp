package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	@Override
	public void signUp(User user) {
		System.out.println("Hibernate ile hesap oluşturuldu! " + user.geteMail());
		System.out.println("Aktivasyon maili gönderildi.");
	}

	@Override
	public void signIn(User user) {
		System.out.println("Sisteme giriş yapıldı. " + user.geteMail());

	}

	@Override
	public List<User> getAll() {
		System.out.println("Sisteme kayıtlı kişiler: ");
		for(User user:users) {
			System.out.println(user.geteMail());
		}
		return users;

	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				
				return user;
			}
		}
		return null;
	}
}
