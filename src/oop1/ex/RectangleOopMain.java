package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.initRectangle(5, 5);
        rectangle1.caculatePerimeter();
        rectangle1.caculateArea();
        rectangle1.isSqaure();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.initRectangle(10, 5);
        rectangle2.caculatePerimeter();
        rectangle2.caculateArea();
        rectangle2.isSqaure();
    }
}
