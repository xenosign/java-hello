package poly2.ex5;

public class Duck implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리는 뒤뚱뒤뚱");
    }
}
