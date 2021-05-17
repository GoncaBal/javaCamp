package eCommerceSystem.business.concretes;

import java.util.Scanner;

import eCommerceSystem.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public void verification() {
		@SuppressWarnings("resource")
		Scanner  input=new Scanner(System.in);
		System.out.println("Maili doğrulamak için 1'e basın : ");
		int test=input.nextInt();
		if(test==1) {
			System.out.println("Doğrulama işlemi başarılı.");
		}
		else {
			System.out.println("Doğrulama başarısız oldu. ");
		}
		
	}

}
