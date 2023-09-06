package ey_9;

import java.util.regex.Pattern;

public class MetaCharcacterInRegex {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		
		System.out.println(Pattern.matches("\\d", "1234"));
		System.out.println(Pattern.matches("\\d*", "1234"));
		
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("\\D*", "abc"));
		System.out.println(Pattern.matches("\\D*", "123"));
		
		System.out.println("Core Java Regex".replaceAll("\\s+",""));
	}

}
