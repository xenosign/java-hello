package poly2.ex6;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw(), new Duck(), new Chicken()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
            if (animal instanceof Fly) flyAnimal((Fly) animal);
            // 또는,
            // if (animal instanceof Fly) ((Fly) animal).fly();
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }

    private static void flyAnimal(Fly animal) {
        animal.fly();
    }
}
