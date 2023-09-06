package ey_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWithQuantifier {
	
	private static  final String REGEX = "a*b";
	private static String INPUT_STRING = "aabPQRaabMNOabXYZb";
	private static  final String REPLACED ="_";
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(REGEX);
		
		Matcher m = p.matcher(INPUT_STRING);
		
		StringBuffer sb = new StringBuffer();
		
		while (m.find()) {
			m.appendReplacement(sb, REPLACED);
			
		}
		System.out.println(sb.toString());
	}

}
