package SecondDay;

public class LocalInnerClass {

	private int data = 20;

	void messaage() {
		class XYZ {
			void show() {

				System.out.println("The value of data is " + data);
			}
		}
		XYZ obj = new XYZ();
		obj.show();
	}

	public static void main(String[] args) {
		LocalInnerClass obj2 = new LocalInnerClass();
		{
			obj2.messaage();
		}

	}
}
// TODO Auto-generated method stub
