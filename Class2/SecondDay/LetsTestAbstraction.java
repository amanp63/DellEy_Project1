package SecondDay;

abstract class Shape {
	// unique functionality - define
	abstract void draw(); // declaration

	int length, breath, height, area, radius;
	double areaofCircle;

	// common functionality which every one can use

	void purpose() {
		System.out.println("Calculate the area of different shapes ");
	}

}

class Triangle extends Shape {

	void draw() {
		int breath = 20, height = 30;
		area = (breath * height) / 2;
		System.out.println("Area of Triangle is" + area);
	}

}

class Rectangle extends Shape {

	void draw() {
		int length = 20, breath = 50;
		area = (length * breath);
		System.out.println("Area of Rectangle is" + area);

	}
}

class Circle extends Shape {
	@Override
	void draw() {
		int radius = 5;
		areaofCircle = Math.PI * radius * radius;
		purpose();

		System.out.println("Area of Rectangle is" + areaofCircle);
	}

}

public class LetsTestAbstraction {
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Circle circ = new Circle();
		circ.draw();

	}
}
