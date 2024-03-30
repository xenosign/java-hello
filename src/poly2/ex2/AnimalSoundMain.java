package poly2.ex2;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        // 부모 클래스는 자식 클래스를 담을 수 있으며
        // 메서드 오버라이딩 우선순위에 따라 각각의 오버라이드 된 메서드가 실행된다
        // 이를 통해서 타입에 대한 문제를 해결할 수 있다!
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
