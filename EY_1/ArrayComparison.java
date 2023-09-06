package EY_1;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] intArr1= {1,2};
		int[] intArr2= {1,2};
		
		boolean[] blnArr1= {true,false};
		boolean[] blnArr2= {true,true};
	
		if(intArr1==intArr2) {
			System.out.println("==works for Arrays");
		}else {
			System.out.println("==does not work for arrays");
		}
		if(blnArr1==blnArr2) {
			System.out.println("==works for arrays");
			
		}else {
			System.out.println("==does not work for Arrays");
		}
		boolean result = Arrays.equals(blnArr1, blnArr2);
		System.out.println("Result is " + result);
		
		System.out.println("Result is " + Arrays.equals(intArr1, intArr2));
		
	}

}
