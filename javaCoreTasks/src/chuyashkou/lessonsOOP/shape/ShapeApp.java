package chuyashkou.lessonsOOP.shape;

public class ShapeApp {
    public static void main(String[] args) {

        Shape circle1 = new Circle("Red", 1, 2);
        Shape circle2 = new Circle("White", 3, 4);
        Shape rectangle1 = new Rectangle("Black", 5, 6);
        Shape rectangle2 = new Rectangle("Yellow", 7, 8);

        Shape[] shapes = {circle1, circle2, rectangle1, rectangle2};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
