// Подкласс Circle (Круг)
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода getArea() для круга
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
