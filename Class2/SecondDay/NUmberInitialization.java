package SecondDay;

public class NUmberInitialization {
	int number1;
	static int number2;
	
	static {
		System.out.println("Static Initializer block");
		number2=100;
		
	}
	NUmberInitialization() {
		number1=20;
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("The value of number2 is " + number2);
		NUmberInitialization obj = new NUmberInitialization();
		System.out.println("The value of number1 is " + obj.number1);
		
		

}
}
