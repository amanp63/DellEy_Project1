package ey_class5;

class SampleClass {
}

interface MyInterface {
}

public class ReflectionClassInJava {

	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}

	public static void main(String[] args) throws ClassNotFoundException {

		SampleClass obj = new SampleClass();

		ReflectionClassInJava rc = new ReflectionClassInJava();
		rc.printName(obj);

		Class c = boolean.class;
		System.out.println(c.getName());

		Class c2 = ReflectionClassInJava.class;
		System.out.println(c2.getName());

		Class c4 = Class.forName("ey_class5.ReflectionClassInJava");
		System.out.println(c4.getName());

	}
}
