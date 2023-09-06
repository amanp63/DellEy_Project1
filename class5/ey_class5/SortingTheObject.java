package ey_class5;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private int age;
	private int salary;

	public Employee(int empId, String empName, int age, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// Compare based on empId
		return Integer.compare(this.empId, other.empId);
	}

	public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
		public int compare(Employee emp1, Employee emp2) {
			return Integer.compare(emp1.age, emp2.age);
		}
	};

	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		public int compare(Employee emp1, Employee emp2) {
			return emp1.empName.compareTo(emp2.empName);
		}
	};

	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		public int compare(Employee emp1, Employee emp2) {
			return Integer.compare(emp1.salary, emp2.salary);
		}
	};

	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", age=" + age + ", salary=" + salary
				+ '}';
	}
}

public class SortingTheObject {
	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(123, "A", 25, 5000);
		empArr[1] = new Employee(101, "Z", 24, 5500);
		empArr[2] = new Employee(134, "X", 26, 5400);
		empArr[3] = new Employee(130, "B", 27, 5800);

		Arrays.sort(empArr); // Sorting by empId
		System.out.println("Sorted emp array by empId: " + Arrays.toString(empArr));

		Arrays.sort(empArr, Employee.ageComparator); // Sorting by age
		System.out.println("Sorted emp array by age: " + Arrays.toString(empArr));

		Arrays.sort(empArr, Employee.nameComparator); // Sorting by name
		System.out.println("Sorted emp array by name: " + Arrays.toString(empArr));

		Arrays.sort(empArr, Employee.salaryComparator); // Sorting by salary
		System.out.println("Sorted emp array by salary: " + Arrays.toString(empArr));
	}
}