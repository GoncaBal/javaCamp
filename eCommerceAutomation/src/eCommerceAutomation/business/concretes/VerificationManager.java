package eCommerceAutomation.business.concretes;

import eCommerceAutomation.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public void verification(String tıkla) {
		System.out.println(tıkla+" Aktivasyon işlemi başarılı!");
		
	}

}
