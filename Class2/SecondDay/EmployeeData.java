package SecondDay;

public class EmployeeData {
//non static
	int empId;
	String empName;

	static String orgAddress = "ABC XYZ";

	static void orgAddressChange() {
		orgAddress = "MNO PQR";
	}

	EmployeeData(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	void display() {
		System.out.println("Id of employee is " + empId + "and name of employee is " + empName + "and orgAddress is "
				+ orgAddress);

	}

	public static void main(String[] args) {
		EmployeeData.orgAddressChange();
		EmployeeData e1 = new EmployeeData(123, "JOHN");
		EmployeeData e2 = new EmployeeData(789, "CHARLIE");

		e1.display();
		e2.display();

	}

}
