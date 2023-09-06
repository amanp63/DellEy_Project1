package ey_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetsDivideStringUsingGroupFunction {
	private static final String PATTERN = "(.*)(\\d)(.*)";
	private static String INPUT_LINE = "This is" + "Group 1 Regex session";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_LINE);

		while (m.find()) {
			System.out.println("Default Group is" + m.group(0));
			System.out.println("Group 1 is" + m.group(1));
			System.out.println("Group 2 is" + m.group(2));
			System.out.println("Group 3 is" + m.group(3));
			System.out.println("Total Group count is" + m.groupCount());

		}

	}

}
