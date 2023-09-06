package EY_1;

public class InstanceOfKeyword {

	public static void main(String[] args) {
		InstanceOfKeyword obj = new InstanceOfKeyword();
		System.out.println(obj instanceof InstanceOfKeyword);
		obj=null;
		System.out.println(obj instanceof InstanceOfKeyword);

	}

}
