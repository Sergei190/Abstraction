// Подкласс Rectangle (Прямоугольник)
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Реализация метода getArea() для прямоугольника
    public double getArea() {
        return width * height;
    }
}
