package EY_1;

public class Class1 {
	int empId;
	String empName;
	int empSalary;
	String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public static void main(String[] args)  {
	Class1 emp = new Class1();
	
	emp.setEmpId(0);
	emp.setEmpName("ABC");
	emp.setEmpDesignation("Software Engineer");
	emp.setEmpSalary(5000);
	
	System.out.println("Id is " + emp.getEmpId());
	System.out.println("Name of the Employee is" + emp.getEmpName());
	System.out.println("Designation of the Employee is" +  emp.getEmpDesignation());
	System.out.println("Salary of the Employee is" + emp.getEmpSalary());
	}

}
