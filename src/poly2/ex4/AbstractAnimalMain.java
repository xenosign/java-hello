package poly2.ex4;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        // 배열을 사용하여 중복 코드 최소화
        // ctrl + alt + n 으로 위의 변수를 배열로 땡겨서 코드 단축하기 가능
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

        // iter 로 배열 만들기 가능
        // ctrl + alt + m 으로 특정 코드 메서드화 가능
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
}
