package EY_1;

public class MinimumValueINArray {
	public static void main(String[] args) {
		int intArr[] = {10,2,3,5,6,7,8,56,8,33,4};
		min(intArr);
		
	}
	static void min(int[] intArr) {
		int min = intArr[0];
		for(int i=0; i<intArr.length;i++) {
			if(min>intArr[i]) {
				min=intArr[i];
			}
		}
		System.out.println("Minimum value is " +  min);
	}
}
