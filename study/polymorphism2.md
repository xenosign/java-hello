# 다형성2

## 다형성이 필요한 이유

- 개, 고양이, 소와 같은 클래스에서 비슷한 특정 메서드를 실행하는 프로그램에서 다른 동물을 추가하고 싶으면 코드 중복이 발생한다

```java
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
```

- soundCaw 메서드에 다른 동물을 넘기려고 해도 타입 자체가 달라서 에러가 발생
- 따라서 하나의 타입으로 여러가지 타입을 사용할 수 있다면? 여기서 다형성 참조를 사용한 해결책이 등장

## 다형성 활용 2

- 부모는 자식 클래스를 담을 수 있다
- 오버라이드 된 메서드는 항상 우선 순위를 가진다
- 이 두가지의 조합으로 타입 문제를 해결이 가능
- 자식 타입이 달라지는 경우 부모 타입으로 넘기고, 부모는 자식을 담을 수 있으므로 타입 문제를 피하고 오버라이드 우선 순위에 따라서 원하는 메서드 실행도 가능

```java
public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        // 오리가 추가 되어도 문제 없이 작동
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
```

- 이렇게 되면 다른 동물이 추가 되어도 soundAnimal 은 문제 없이 실행이 가능하다

## 다형성 활용 3

- 배열과 for 문을 사용하여 중복 코드를 제거

```java
public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
```

- 잘 작성된 코드는 새로운 기능이 추가 되어도 변하는 부분이 적을 수록 잘 작성된 코드이다

## 다형성 사용을 위한 제한 사항

### Animal 클래스를 직접 만들어서 사용할 가능성

- Animal 클래스는 다른 동물을 담을 수는 있지만 실제로 만들어서 사용할 필요는 없다. 따라서 이를 막아주는 것이 좋다

** 나의 접근

- 부모 클래스의 생성자에 private 를 걸면 안될까?
- 안된다, 생성자를 상속 받는 클래스에서 생성자에 접근을 못하기 때문에 클래스 생성이 안되는 문제 발생

### Animal 클래스를 상속 받는 곳에서 메서드 오버라이딩을 안했을 가능성

- 예를 들어 Pig 클래스를 만들었는데 메서드 오버라이딩을 깜박 한 경우

- ** 나의 접근

- 부모 클래스의 메서드에 private 를 걸면 안될까?
- 안된다, 결국 상위 클래스의 타입으로 오버라이딩 된 자식의 메서드에 접근해야 하지만 상속 관계도 엄밀히 보면 다른 클래스가 되므로 메서드 호출이 불가능

## 추상 클래스 1

### 추상 클래스

- 부모 클래스는 제공하지만 실제 생성되면 안되는 클래스
- 추상적인 개념만을 제공하고, 실체인 인스턴스가 존재하지 않는 클래스

```java
public abstract class Animal {
};
```

### 추상 메서드

- 자식 클래스가 반드시 오버라이딩을 해야만 하는 메서드
- 추상적인 개념을 제공하는 메서드이므로 실체가 없어 바디가 없다
- 추상 메서드가 하나라도 있는 클래스는 반드시 추상 클래스로 선언을 해야한다
- 추상 메서드는 실행이 되면 안되므로 인스턴스가 생성이 되면 안되기 때문에, 클래스를 추상 클래스로 선언하여 생성 자체를 막아야 한다

```java
public abstract void sound();
```

- 따라서 추성 클래스와 추상 메서드를 사용하면 이전의 다형성에서 발생할 수 있는 문제점을 해결 가능하다

## 추상 클래스 2

- 순수 추상 클래스 : 모든 메서드가 추상 메서드인 추상 클래스

### 순수 추상 클래스의 특징

- 인스턴스 생성 불가능
- 상속 시 자식은 반드시 메서드 오버라이드 필요
- 다형성을 위해서 사용
- 일종의 구현을 위한 규격으로 사용이 되며, 이는 일반적인 인터페이스와 같이 작동한다. 그래서 자바는 인터페이스라는 개념을 제공한다

## 인터페이스

- 인터페이스는 순수 추상 클래스의 모든 특징을 가지며, 약간의 편의 기능이 추가
- 인터페이스의 모든 메서드는 public abstract 가 무조건 들어가므로 생략이 가능하다
- 인터페이스는 다중 구현(다중 상속)을 지원
- 인터페이스는 상속이라고 하는게 아니라 구현이라고 표현한다. 어짜피 다 직접 구현해야 하기 때문
    - 따라서 상속 extends 대신 implements 라는 키워드 사용
    - UML 에서는 상속은 실선이지만 인터페이스는 점선을 사용한다

```java
public interface InterfaceAnimal {
    public abstract void sound();

    void move();    // 생략 가능
}
```

### 인터페이스의 멤버 변수

- 인터페이스이 멤버 변수는 상수로 사용 해야만 하므로 public static final 이 기본으로 들어간다
- 대문자에 _ 로 구분

```java
public interface InterfaceAnimal {
    public static final double MY_PI = 3.14;
    double MY_PI2 = 3.14;
}
```

### 인터페이스를 사용해야 하는 이유

- 제약 : 메서드를 반드시 구현해야 한다는 제약을 주기 위해
    - 추상 클래스에는 개발자가 임의로 실행 가능한 메서드를 추가해도 문제가 발생하지 않음 -> 이렇게 되면 최초 구현 의도 실패
    - 인터페이스를 쓰면 최초 제약을 어기는 것을 애초에 방지가 가능하다
- 다중 구현 : 클래스 상속은 부모를 하나만 지정할 수 있지만, 인터페이스는 부모를 여려명 두는 다중 구현이 가능하기 때문
- JAVA 8, 9 에서 각가 default 메서드, private 메서드가 등장하여 인터페이스에 메서드 구현이 가능하지만 나중에 배운다

## 인터페이스 다중 구현

### 자바가 다중 상속을 지원하지 않는 이유?

- 다이아몬드 문제 : 어떤 부모에서 호출을 해야하는지 JAVA 가 판단이 불가능한 문제
- 계층 구조가 매우 복잡해짐

### 인터페이스가 다중 구현을 가능한 이유?

- 어짜피 부모 인터페이스는 어짜피 기능이 없기 때문에 동일한 이름의 메서드를 가져와도 결국 구현한 자신의 메서드를 사용하기 때문에

## 클래스와 인터페이스 활용

- 기존 동물 예제에 Fly 라는 인터페이스를 추가하자, 나는 동물이면 Fly 인터페이스 구현이 가능

- Fly 인터페이스를 만들고 날 수 있는 동물에 implements 추가

```java
public interface Fly {
    void fly();
}

public class Duck extends AbstractAnimal implements Fly {
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
        System.out.println("오리 날다");
    }
}
```

- 선언을 해서 사용 + instanceof 를 사용해서 Fly 인터페이스를 구현한 인스턴스는 fly 메서드 사용

```java
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
```