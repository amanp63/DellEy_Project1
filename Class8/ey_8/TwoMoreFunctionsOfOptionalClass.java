package ey_8;

import java.util.Optional;

public class TwoMoreFunctionsOfOptionalClass {
	public static void main(String[] args) {
		
		String[] str = new String[5];
		
		str[2]="Optional class updates are coming soon";
		
		Optional<String> empty = Optional.empty();
		
		System.out.println(empty);
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		
	}

}
