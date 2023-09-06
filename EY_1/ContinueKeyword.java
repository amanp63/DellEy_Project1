package EY_1;

public class ContinueKeyword {
	public static void main(String[] args) {
		PQR: for(int i =1; i<=3; i++) {
			for (int j = 1; j<=3; j++) {
				if(i==2 && j==2) {
					continue PQR;
					
				}
				System.out.println(i +" "+ j);
			}
		}
	}
}
