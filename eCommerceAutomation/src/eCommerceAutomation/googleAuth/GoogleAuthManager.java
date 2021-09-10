package eCommerceAutomation.googleAuth;

import java.util.regex.Pattern;

public class GoogleAuthManager {
	public static boolean isValidMail(String email) {

		String emailPattern = "^[A-Z0-9._%+-]+@(gmail).[A-Z]{2,6}$";

		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();

	}
}
