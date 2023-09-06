package EY_1;

public class ArrayCreation {
	public static void main(String[] args) {
		//declaration - instantation-
		int[] intArr=new int[6];
		 
		//initialization
		intArr[0]=10;
		intArr[5]=60;
		intArr[2]=20;
		intArr[4]=45;
		intArr[3]=15;
		intArr[1]=18;
		//declaration, instantiated and initialization
		String[] strArr = {"Z","A","X","B","D"};
		
		//traverse
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i] + " ");
			
		}
		System.out.println();
		for(int i : intArr) {
			System.out.println(i + " ");
		}
	}

}
