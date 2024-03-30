package poly2.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이의 보법은 다르다");
    }
}
