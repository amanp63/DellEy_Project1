package ey_9;

import java.util.regex.Pattern;

public class ValidateMobileNumber {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347"));
		String mobileNumber = "6392580722"; 
		if (Pattern.matches("\\d{10}", mobileNumber)) {
			System.out.println("Valid mobile number.");
		} else {
			System.out.println("Invalid mobile number.");
		}
	}
}

