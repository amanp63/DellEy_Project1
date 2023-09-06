package ey_10;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {
	
	public static void main(String[] args) {
		ResourceBundle rs = ResourceBundle.getBundle("ey_10.TestBundle");
		displayValue(rs);
		
		Locale swedishLocale = new Locale("sv", "SE");
		ResourceBundle rs2 = ResourceBundle.getBundle("ey_10.TestBundle",swedishLocale );
		displayValue(rs2);
		
	}

	private static void displayValue(ResourceBundle bundle) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello Message : "+bundle.getString("my.hello"));
		System.out.println("Hello Message : "+bundle.getString("my.bye"));
		System.out.println("Hello Message : "+bundle.getString("my.question"));
		
		
		
	}

}
