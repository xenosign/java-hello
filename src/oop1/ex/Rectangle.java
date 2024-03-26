package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int preimeter;
    int area;
    boolean isSqaure;

    void initRectangle(int widthInput, int heightInput) {
        width = widthInput;
        height = heightInput;
    }

    void caculatePerimeter() {
        preimeter = width * 2 + height * 2;
        System.out.println("둘레는 " + preimeter);
    }

    void caculateArea() {
        area = width * height;
        System.out.println("넓이는 " + area);
    }

    void isSqaure() {
        isSqaure = width == height ? true : false;
        if (isSqaure) {
            System.out.println("정사각형 입니다");
        } else {
            System.out.println("정사각형이 아닙니다");
        }
    }
}
