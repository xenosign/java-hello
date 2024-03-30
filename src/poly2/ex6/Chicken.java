package poly2.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리는 뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("닭도 난다");
    }
}
