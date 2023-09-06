package EY_1;

public class VariableInitialization {
	int number;
	
	//No Arg
	VariableInitialization(){
		number = 100;
	}
	
	VariableInitialization(int number){
		//this keyword resolves the ambiguity between non static instance variable and method parameter
		this.number=number;
	}
	public static void main(String[] args) {
		VariableInitialization obj = new VariableInitialization();
		System.out.println("The value of number is " + obj.number);
		
		VariableInitialization obj2 = new VariableInitialization(1000);
		System.out.println("The value of number is " + obj2.number);
	}
}
