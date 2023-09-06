package SecondDay;

public class EqualsMethod {

	
	public static void main(String[] args) {
		
		String str1 = "String is a immutable class";
		String str2 = "String is a immutable class";
		
		if(str1==str2) {
			System.out.println("==Works for literals or constants");
		}else {
				System.out.println("==does not work for literals or constants");
			}
			
			//object
			String str3 = new String("String is a immutable class");
			String str4 = new String("String is a immutable class");
			
			if(str3==str4) {
				System.out.println("==works for literals or constants");
				
			} else {
				System.out.println("== does not works for literals or constants");
			}
			
			if(str3.equals(str4)) {
				System.out.println("equals method works for OBJECTS");
			}
			else {
				System.out.println("equals method does not work for OBJECTS");
			}
			
			System.out.println("Memory address is " + str3.hashCode());
			System.out.println("Memory address is " + str4.hashCode());
			}
		

	}


