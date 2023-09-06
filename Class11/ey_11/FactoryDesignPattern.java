package ey_11;

interface Shape {

	public void draw();

}

class Rectangle implements Shape {

	@Override

	public void draw() {

		System.out.println("rectangle Rectangle class draw function");

	}

}

class Circle implements Shape {

	@Override

	public void draw() {

		System.out.println("Circle class draw function");

	}

}

class Square implements Shape {

	@Override

	public void draw() {

		System.out.println("Square class draw function");

	}

}

class ShapeFactory {

	public Shape getShape(String shapeType) {

		if (shapeType == null) {

			return null;

		}
		if (shapeType.equalsIgnoreCase("Circle")) {

			return new Circle();

		}
		if (shapeType.equalsIgnoreCase("Rectangle")) {

			return new Rectangle();

		}
		if (shapeType.equalsIgnoreCase("Square")) {

			return new Square();

		}

		return null;

	}

}

public class FactoryDesignPattern {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape(null);
		if (null != shape2) {
			shape2.draw();
		} else {
			System.out.println("Shape is null.");
		}

		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
	}
}


