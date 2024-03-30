package poly2.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        // 배열을 사용하여 중복 코드 최소화
        // ctrl + alt + n 으로 위의 변수를 배열로 땡겨서 코드 단축하기 가능
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

        // iter 로 배열 만들기 가능
        // ctrl + alt + m 으로 특정 코드 메서드화 가능
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
