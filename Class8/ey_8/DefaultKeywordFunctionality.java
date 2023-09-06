package ey_8;

interface TestInerface{
	public void square(int a); 
	
	default void show() {
		System.out.println("Only for the one class, default method is defined "+ " So that other classes do't have to implement this");
		
	}
		
	
}
public class DefaultKeywordFunctionality implements TestInerface {
	
	@Override
	public void square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		DefaultKeywordFunctionality obj = new DefaultKeywordFunctionality();
		
		obj.square(4);
		obj.show();
	}

}
