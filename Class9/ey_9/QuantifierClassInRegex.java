package ey_9;

import java.util.regex.Pattern;

public class QuantifierClassInRegex {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "z"));
		System.out.println(Pattern.matches("[amn]?", "am"));
		System.out.println(Pattern.matches("[amn]?", ""));
		
		System.out.println(Pattern.matches("[amn]+", "aaaa"));
		System.out.println(Pattern.matches("[amn]+", "aaaammm"));
		System.out.println(Pattern.matches("[amn]+", "aaammmooo"));
		
		
		System.out.println(Pattern.matches("[amn]*", "z"));
		System.out.println(Pattern.matches("[amn]*", "aaammm"));
	}

}
