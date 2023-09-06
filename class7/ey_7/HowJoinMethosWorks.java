package ey_7;

public class HowJoinMethosWorks extends Thread {
	public static void main(String[] args) {

		HowJoinMethosWorks t1 = new HowJoinMethosWorks();
		HowJoinMethosWorks t2 = new HowJoinMethosWorks();
		HowJoinMethosWorks t3 = new HowJoinMethosWorks();

		t1.start();
		try {
			t1.join();

		} catch (InterruptedException e) {

			// TODO: handle exception
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Running Thread is" + Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			System.out.println(i);

		}

	}

}
