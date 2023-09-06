package EY_1;
import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		char[] chArr1= {'z','Q','W','E','r','D','o'};
		char[] ch2 = new char[3];
		System.arraycopy(chArr1, 1, ch2, 0, 3);
		System.out.println(Arrays.toString(ch2));
		System.out.println(new String(ch2));
		
	}

}
