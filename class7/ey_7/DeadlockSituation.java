package ey_7;

public class DeadlockSituation {
	public static void main(String[] args) {

		final String resource1 = "A";
		final String resource2 = "B";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource1");
					try {
						Thread.sleep(1000); // Introducing a delay to increase the likelihood of deadlock
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread 1: trying to lock resource2");
					synchronized (resource2) {
						System.out.println("Thread 1: locked resource2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();

					}
					System.out.println("Thread 2: trying to lock resource1");
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}