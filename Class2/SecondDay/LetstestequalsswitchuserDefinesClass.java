package SecondDay;
import java.util.Objects;

//User defined or custom class

class Employee {
	String firstname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstname, other.firstname);
	}

	
	
}

public class LetstestequalsswitchuserDefinesClass {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setFirstname("ABC");
		e2.setFirstname("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("equals work with custom class");
		}
		else {
			System.out.println("equalsdoes not work with custom class");
		}
		
		System.out.println("Memory address is " + e1.hashCode());
		System.out.println("Memory address is " + e2.hashCode());
	}

}
