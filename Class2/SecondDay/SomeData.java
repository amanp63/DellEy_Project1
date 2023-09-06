package SecondDay;

interface SampleData {
	void fullName(String firstName, String lastName);
	
}

public class SomeData implements SampleData {
	public void fullName(String firstName, String lastName) {
		System.out.println("name is " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		SomeData obj = new SomeData();
		obj.fullName("ABC", "XYZ" );
		// TODO Auto-generated method stub

	}

}
