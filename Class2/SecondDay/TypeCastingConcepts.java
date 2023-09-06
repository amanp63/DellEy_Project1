package SecondDay;

class Machine {
	void start() {
		System.out.println("Machine has started");

	}

	void stop() {
		System.out.println("Machine has stopped");
	}
}

class Camera extends Machine {
	void start() {
		System.out.println("Camera has started");

	}

	void snap() {
		System.out.println("Photo clicked");
	}
}

public class TypeCastingConcepts {

	public static void main(String[] args) {

		Machine m = new Machine();
		m.start(); // MAchine has started
		m.stop(); // Machine has stopped

		Camera c = new Camera();
		c.start(); // Camera has started
		c.stop(); // Camera has stopped
		c.snap(); // Photo clicked

		Machine M1 = new Machine();
		M1.start();
		M1.stop();

		// Upcasting happen Automatically
		Machine M2 = c;
		M2.start();
		M2.stop();

		/*
		 * Downcasting - error - wrong Machine M3 = new Machine(); Camera c2 = (Camera)
		 * M3; c2.start(); c2.stop(); c2.snap();
		 */

		// Downcasting - True
		Machine M3 = new Camera();
		Camera c2 = (Camera) M3;
		c2.start();
		c2.stop();
		c2.snap();

	}

}
