package eCommerceAutomation.core.utilities;

import java.util.regex.Pattern;

public class MailValidator {
	public static boolean isEmailValid(String email) {

		String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();

	}
}
