// Пример использования классов
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 20);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
