package poly2.ex3;

import poly2.ex2.Animal;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
