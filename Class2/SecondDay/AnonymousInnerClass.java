package SecondDay;

abstract class Sample {
	abstract void show();

}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Sample obj = new Sample() {
			void show() {
				System.out.println("Hello Everyone");
			}
		};

		obj.show();

	}

}
