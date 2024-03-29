# 상속 관계

- 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해주는 개념
- 상속을 사용하려면 extends 키워드를 사용하면 대상은 하나만 사용할 수 있다
- 부모 클래스(슈퍼 클래스)
- 자식 클래스(서브 클래스)

## 상속 관계의 특징

- 부모 클래스는 자식 클래스가 어떤게 있는지 알지 못한다. 따라서 부모 클래스는 자식 클래스에 접근이 불가능
- 자식 클래스는 부모 클래스를 알고 있다

## 단일 상속

- 자바는 다중 상속을 지원하지 않아서 extends 대상은 하나만 선택이 가능하다
- 대신 자식이 다른 클래스의 부모 클래스가 되는 것은 가능하다

## 상속과 메모리 구조

`이 부분을 명확히 이해해야만 다형성 등을 이해하는데 문제가 없다! 매우 중요!!`

- 상속 받은 클래스를 생성하면 하나의 인스턴스에 부모의 필드나 메서드만 물려 받는 것이 아니다
- 생성된 인스턴스에 부모의 클래스도 포함해서 총 2개의 클래스를 생성한다
- 외부에서는 하나의 인스턴스를 만드는 것으로 보이지만, 실제로는 인스턴스 내부에 부모와 자식이 모두 생성되고 공간도 구분 된다

## 상속 관계의 호출

- 먼저 변수의 클래스를 기준으로 호출
- 호출을 시도 했을 때, 없으면 그때 부모 타입에서 찾는다
- 그래도 못찾으면 컴파일 에러 발생

## 상속과 메서드 오버라이딩

- 자식 클래스에서 부모 클래스의 메서드를 재정의하여 사용하는 것
- 메서드 이름은 같지만 새로운 기능으로 작동한다
- 오버라이딩이 되면 자식 클래스에 해당 메서드를 새롭게 생성을 한다. 따라서 호출을 할 때 먼저 자식 클래스에서 먼저 찾으므로 오버라이드된 메서드가 먼저 호출 된다

### 어노테이션

- @ 이 가 붙은 부분은 어노테이션이라고 하며, 프로그램이 읽을 수 있는 특수한 형태의 주석이다
- @Override 라고 쓰면 해당 메서드는 오버라이드 되었다는 표시
- @Override 가 붙었는데 해당 메서드가 오버라이드가 아닌 경우(메서드 명이 다른 경우) 컴파일 에러를 발생 시켜 준다

```java
public class ElectricCar extends Car {
    @Override
    // 이렇게 되면 에러 발생! 메서드 명이 다르므로 오버라이드가 안되는 케이스
    public void moveeee() {
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge() {
        System.out.println("차를 충전합니다");
    }
}
```

## 메서드 오버라이딩 조건

- 메서드 이름이 같아야 한다
- 매겨변수의 타입, 순서, 개수가 같아야 한다
- 반환 타입이 같아야 한다
- 접근 제어자가 상위 클래스의 메서드보다 저 제한적이면 안된다
- static, final, private 키워드가 붙은 메서드는 오버라이딩 될 수 없다
    - static : 클래스 레벨에서 사용하므로 인스턴스에서 사용하는 오버라이딩이 무의미
    - final : 최초 정의를 제외하고 재정의가 불가능 하므로 불가능
    - private : 다른 클래스에서의 접근을 막기 때문에 오버라이딩 불가
- 생성자는 오버라이딩 할 수 없다

## 상속과 접근 제어

### UML 표기법

- `+` : public / 모든 호출 허용
- `#` : protected / 같은 패키지 호출은 허용 + 상속 관계의 호출도 허용
- `~` : default / 같은 패키지 안에서만 호출 허용
- `-` : private / 모든 호출 불가

### 상속에서 접근 제어가 필요한 이유

- 상속은 하나의 인스턴스 내부에 다른 클래스 2개를 따로 생성하는 개념
- 따라서 자식이 부모의 것을 호출할 때, 부모 입장에서는 외부에서 호출하는 것과 같다
- 외부 호출이므로 접근 제어자를 통해서 필드 및 메서드 접근 설정 가능

## super - 부모 참조

- 부모와 자식의 필드 값이 같거나, 메서드가 오버라이딩이 되어 있는 경우 부모의 필드나 메서드를 호출할 수 없는 문제 발생
- 이 때 super 키워드를 쓰면 부모 클래스에 직접 접근이 가능하다

```java
public class Child extends Parent {
    public String child = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);  // 상속을 무시하고 부모 클래스 호출

        this.hello();
        super.hello();  // 상속을 무시하고 부모 클래스 호출
    }
}
```

## super 생성자

- 상속 관계는 하나의 인스턴스에 자식과 부모 클래스를 전부 만드는 것이므로 생성자 역시 모두 호출 되어야만 한다
- 규칙 : 상속 관계를 이용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다

```java
public class ClassA {
    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}

public class ClassB extends ClassA {
    public ClassB(int a) {
        super();  // 기본 생성자가 매개 변수가 없을 경우 생략 가능
        System.out.println("ClassB 생성자, a = " + a);
    }

    public ClassB(int a, int b) {
        super();  // 기본 생성자가 매개 변수가 없을 경우 생략 가능
        System.out.println("ClassB 생성자, a = " + a + " / b = " + b);
    }
}

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);  // 상속 받은 클래스의 기본 생성자가 매개 변수가 있으므로, 자동 생성 X -> 개발자가 직접 처리 해줘야 함
        System.out.println("ClassC 생성자");
    }
}

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();

        // 실행 결과
        // ClassA 생성자
        // ClassB 생성자, a = 10 / b = 20
        // ClassC 생성자
    }
}
```

- 하나의 인스턴스에 부모와 자식이 모두 생성되는 구조이므로 ClassA 부터 생성 -> B -> C 순서로 생성되기 때문에 실행 결과가 A -> B -> C 순으로 나온다
- 부모가 완성 되어야 자식을 낳을 수 있으므로

### 자기 자신 생성자 호출

- 자식 클래스는 마지막에 super() 를 호출 할 수 밖에 없다
- 아래 처럼 this 를 이용해서 자기 자신의 생성자를 호출해도, 결국 super() 는 한번 실행 된다

```java
public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 100); // 자기 자신의 생성자를 호출
        System.out.println("ClassB 생성자, a = " + a);
    }

    public ClassB(int a, int b) {
        super();  // 결국 한번은 호출되는 super()
        System.out.println("ClassB 생성자, a = " + a + " / b = " + b);
    }
}

public class Super2Main {
    public static void main(String[] args) {
        ClassB classB = new ClassB(10);

        // 실행 결과
        // ClassA 생성자
        // ClassB 생성자, a = 10 / b = 100
        // ClassB 생성자, a = 10
    }
}
```