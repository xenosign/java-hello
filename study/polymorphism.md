# 다형성

## 다형적 참조

- 부모가 자식 타입을 담는 경우를 다형적 참조라고 한다
- 부모는 자식의 자식도 담을 수 있다
- 반면 자식은 부모를 담을 수 없다

```java
public static void main(String[] args) {
    Parent poly1 = new Child();
    Parent poly2 = new GrandChild();
    // Child child = new Parent(); -> 컴파일 에러 발생 
    // poly1.childMethod(); -> 컴파일 에러 발생
}
```

- 부모는 자식의 기능(메서드)을 호출 할 수 없다. 하지만 인스턴스 내부에 자식 클래스는 존재 하므로 메서드를 호출하고 싶으면 '캐스팅'이 필요하다

## 다형성과 캐스팅

- 다형성으로 클래스를 참조하면 자식 타입의 메서드는 사용이 불가능하다
- 하지만 변수 캐스팅을 하듯 () 를 사용하여 다운 캐스팅을 하면 사용이 가능!

```java
public class CastingMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        // parent.childMethod() -> 자식 메서드에 접근이 불가능, 컴파일 에러 발생

        // 이런식으로 다운 캐스팅을 하면 자식 메서드에 접근이 가능하다
        Child child = (Child) poly;
        child.childMethod();
    }
}
```

### 다운 캐스팅 실행 순서

```java
public static void main(String[] args) {
    Child child = (Child) poly;     // 다운 캐스팅을 통해 부모 타입을 자식 타입으로 변환하여 대입 시도
    Child child = (Child) x001;     // 참조 값을 읽은 다음 참조 값을 복사하여 자식 타입으로 지정  
    Child child = x001;             // 변환 된 참조 값을 대입
}
```

- 캐스팅을 하여도 poly 의 타입이 변하는 것이 아님. 해당 참조 값을 꺼내고 꺼낸 참조 값이 Child 타입이 되는 것일 뿐

## 캐스팅의 종류

### 업 캐스팅과 다운 캐스팅

- 업 캐스팅 : 부모 타입으로 변경
- 다운 캐스팅 : 자식 타입으로 변경

### 일시적 다운 캐스팅

- 기존 코드는 다운 캐스팅을 위해서 Child 인스턴스를 만들어야 하는 메모리 낭비 발생
- 일시적 접근을 위해 일시적 다운 캐스팅이 가능하다

```java
public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 일시적 다운캐스팅을 사용하여서 Child 인스턴스를 만들지 않고 자식 클래스에 접근 가능
        ((Child) poly).childMethod();
    }
}
```

### 업 캐스팅

- 부모는 자식을 담을 수 있으므로 기본적으로 생략 됨

```java
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;    // 생략하지 않고 작성
        Parent parent2 = child;             // 생략 하고 작성
    }
}
```

### 다운 캐스팅과 주의점

- 다운 캐스팅은 잘못 사용할 경우 심각한 런타임 오류 발생이 가능하다
- 그래서 JAVA 에서 업 캐스팅과는 달리 다운 캐스팅은 명시적으로 사용하도록 강제

```java
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        // 런타입 ClassCastException 에러 발생
        child2.childMethod();
    }
}
```

- 아래의 경우 parent2 는 Parent 인스턴스 이므로 Child 가 내부에 생성이 안된 상태
- 따라서 메모리 상에 Child 가 존재하지 않으므로 사용 자체가 불가능하여 에러가 발생한다

### 업 캐스팅이 문제가 없는 이유

- 자식 인스턴스는 생성이 되면 자연스럽게 부모 클래스가 인스턴스 내부에 존재하는 것이 보장이 된다
- 따라서, 메서드 참조에 있어서 아무런 문제가 없다

### 컴파일 오류 vs 런타임 오류

- 컴파일 오류 : 오타, 잘못된 클래스 이름 등 자바 프로그램을 실행하기 전에 발생하는 오류
- 런타임 오류 : 프로그램이 실행되는 시점에서 발생하는 오류, 사용자가 프로그램을 사용하는 시점에서 발생하기 때문에 매우 안좋은 오류이다

## instanceof

- 특정 인스턴스가 해당 클래스로 부터 만들어진 것인지 확인하는 키워드

```java
import poly.basic.Child;
import poly.basic.Parent;

public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    parent instanceof Parent;   // ture
    parent instanceof Child;    // ture, 부모는 자식을 담을 수 있다
    child instanceof Parent;    // false, 자식은 부모를 담을 수 없다
    child instanceof Child;     // true
}
```

- 실제 활용 코드, 인스턴스를 확인 후 다운 캐스팅하여 안전하게 사용한다

```java
public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        // Child 의 인스턴스인지 확인 후, 안전하게 다운캐스팅 하여 사용
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
            // ((Child) parent).childMethod(); -> 요 방법도 가능
        }
    }
}
```

- 자바 16 버전 이후로는 instanceof 사용 시 바로 변수 선언이 가능하다

```java
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();

        // instanceof 사용 시 바로 변수 선언 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
```

## 다형성과 메서드 오버라이딩

- 오버라이딩 된 메서드가 항상 우선권을 가진다. 결국 더 하위 자식의 메서드가 우선권을 가진다
- 반면 변수는 오버라이딩이 우선권을 가지지 않는다

```java
public class OverridingMain {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);    // 변수는 오버라이딩 X
        poly.method();  // 메서드는 오버라이딩 O
    }
}
```

