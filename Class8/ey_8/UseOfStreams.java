package ey_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UseOfStreams {
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		
		//collection never comes twice
		
		Collections.sort(countries);
		for(String country : countries) {
			country = country.toUpperCase();
			if (!country.startsWith("C")) {
				System.out.println("Country name not starting with c --"+ country); //countries never comes wieth collection
				
			}
		}
		
		countries.stream().map(s-> s.toUpperCase()).
		filter(s->!s.startsWith("C")).sorted().forEach(s->System.out.println(s));
	
		
	}

}
