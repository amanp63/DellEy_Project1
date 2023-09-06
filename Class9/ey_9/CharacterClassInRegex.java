package ey_9;

import java.util.regex.Pattern;

public class CharacterClassInRegex {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "a"));//square braces is character class in language of character class
		System.out.println(Pattern.matches("[amn]", "aa"));
		System.out.println(Pattern.matches("[amn]", "m"));
		System.out.println(Pattern.matches("[amn]", "mn"));
		
		System.out.println(Pattern.matches("[^amn]", "z"));
		System.out.println(Pattern.matches("[a-zA-Z]", "B"));
		System.out.println(Pattern.matches("[a-d[m-p]]", "e"));
	}

}
