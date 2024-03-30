package poly2.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        // new Caw() 에서 ctr + alt + v 로 바로 변수 생성 가능
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        cat.sound();
        caw.sound();

        soundCaw(caw);
        // 이 상황에서 새로운 동물이 추가되면 계속적으로 중복되는 코드가 발생한다
        // + 메서드로 풀려고 해도 메서드는 인스터스에 따라 추가되어야 한다
    }

    private static void soundCaw(Caw caw) {
        caw.sound();
    }
}
