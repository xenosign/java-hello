# final 변수

- 최초 한번만 값을 할당할 수 있는 변수

```java
public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;      // 최초 한번만 할당 가능
        // data1 = 20    //  컴파일 에러

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20;  // 컴파일 에러
    }
}
```

## final 필드(멤버 변수)

- 초기화가 안되어 있으면 생성자로 1회 초기화 가능
- 초기화가 되어 있으면 생성자로도 값 할당 불가능

## static final

- 필드 변수의 경우 최초 초기화가 되면, 아무리 인스턴스를 여러개 만들어도 동일한 값을 가질 수 밖에 없음
- 인스턴스를 여러개 만들면 같은 값을 가지는 변수가 여러개 생성되어 메모리 낭비 발생
- 이럴때는 동일한 값을 static final 로 지정하여 스태틱 영역에 1개의 변수만 만들고 공용으로 사용하는 것이 좋음
- 즉, 상수로 활용. 상수는 보통 대문자로 표기한다

```java
public class FieldInit {
    // static final 로 상수처럼 사용, 메모리는 1개만 소모
    static final int CONST_VALUE = 10;
}
```

# 파이널 변수와 상수2

## 자바 상수의 특징

- static final 키워드 사용
- 대문자를 사용하고 _ 로 구분
- 값 변경이 불가능 하므로 필드에를 직접 접근해서 사용

## 상수의 사용

- 상수들은 어플리케이션 전반에서 사용하기 때문에 주로 public 으로 사용 된다
- 상수의 경우 공통 사용이 목적으로 중앙에서 하나로 관리하는 편이 좋다
- 상수는 런타임에 변경이 불가능하므로 변경을 원하면 프로그램을 종료하고 코드 변경 후 다시 실행해야만 한다

## final 변수와 참조

- final 을 변수에 사용하면 변수 값을 변경 불가능
- final 을 참조값에 쓰면 주소 변경이 불가능

# 정리

- 변경이 되면 위험한 값을 final 로 선언하고, 생성자로만 최초 초기화를 가능하게 만들자
- 추후에 실수로 변경이 시도되면 컴파일 오류가 발생하여 쉽게 문제를 찾을 수 있을 것이다

```java
public class Member() {
    private final int id;
    private String name;

    public Member(int id, String name) {
        // 생성자로 최초 초기화만 가능, 추후에 변경을 시도하면 컴파일 에러 발생
        this.id = id;
        this.name = name;
    }
}

```

