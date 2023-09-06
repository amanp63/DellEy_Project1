package EY_1;

public class SwitchCasse {
	public static void main(String[] args) {
		grading('A');
		grading('B');
		grading('C');
		grading('D');
	}

	static void grading(char grade) {
		int success;
		
	switch (grade) {
	case 'A':
	success=1;
	
	System.out.println("Excellent Grade");
	break;
	case 'B':
	case 'C':
	success=0;
	System.out.println("Good Grade");
	break;
	default:
	success=-1;
	System.out.println("Unknown Grade");
	}
	passTheCourse(success);
	}
	static void passTheCourse(int success) {
	switch(success) {
	case 1:
		System.out.println("Passed the course");
		break;
	case 0:
		System.out.println("can give the exam again");
	case -1:
		System.out.println("fail");
		break;
		
	}
}
}
