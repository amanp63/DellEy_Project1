package ey_6;

@FunctionalInterface
interface Circle2 {
    double get(double radius);
}

public class AreaCalculation {
    public static void main(String[] args) {

        Circle2 circleRadius = (r) -> Math.PI * r * r;
        Circle2 circleCircumference = (r) -> 2 * Math.PI * r;

        AreaCalculation obj = new AreaCalculation();

        double area = obj.circleOperation(10, circleRadius);
        double circumference = obj.circleOperation(10, circleCircumference);

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    double circleOperation(double radius, Circle2 operation) {
        return operation.get(radius);
    }
}