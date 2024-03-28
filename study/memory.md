# 자바 메모리 구조와 static

## 자바 메모리 구조

- 자바 메모리는 메서드 영역 / 스택 영역 / 힙 영역 으로 나뉜다
- 메서드 영억 : 클래스 정보를 보관
- 스택 영역 : 실제 프로그램이 실행되는 영역, 메서드가 실행되면 하나씩 쌓인다
- 힙 영역 : 클래스로 부터 생성도니 객체(인스턴스)가 존재하는 영역, 배열도 해당 영역에 보관

### 메서드 영역

- 프로그램을 실행하는데 필요한 공통 데이터를 관리
- 클래스 영역 : 클래스에 관련된 모든 정보
- static 영역 : static 변수
- 런타임 상수 풀 : 프로그램 실행에 필요한 공통 상수를 보관, hello 라는 문자가 자주 쓰이면 자바가 알아서 최적화
- 메서드는 사실 공통된 부분이므로 메서드 영역에 공통으로 생성 후, 힙 영역에서 생성 된 인스턴스가 자신의 정보를 전달하여 공통 코드를 실행시켜서 작동한다

### 스택 영역

- 메서드가 실행 될때 마다 생성되는 실행 스택이 쌓인다
- 스택은 참고로 쓰레드 별로 하나씩 생성된다 -> 멀티 쓰레드 가능

### 힙 영억

- 객체 및 배열이 생성되는 영역, new 로 생성되는 것들이 보관
- GC(Garbage Collection) 이 작동하는 영역
- 참조하는 곳이 전부 사라지면 GC 의 대상이 되어 메모리에서 제거된다

## 스택 영역과 자료 구조

- LIFO(Last In First Out)
- 술집 냉장고 비유, 제일 끝 콜라는 유통기한 넘긴닷!
- Queue 는 FIFO(First In First Out) + 편의점 냉장고

## static 변수

- 특정 클래스에서 공용으로 함께 사용하는 변수를 만들 때 사용하는 키워드, 공용 변수를 만들 수 있다
- static 이 붙은 변수는 클래스 영역(메서드 영역)에서 관리를 따로 한다.
- 즉, 일반 필드는 힙 영억으로 가고 static 이 붙은 필드는 메서드 영역으로 분리하여 보낸다
- 접근할 때는 클래스명에 . 을 사용하여 접근 하는 것을 추천. 인스턴스로 접근하면 해당 변수가 static 인지 인스턴스 변수인지 헷갈리기 때문

```java
public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A " + Data3.count);

        // 인스턴스를 통한 접근
        // 권장 X, 이건 static 변수인지 인스턴스 변수인지 헷갈린다
        Data3 data3 = new Data3("A");
        System.out.println("A " + data3.count);
    }
}
```

### 용어 정리

- 멤버 변수는 static 이 붙은 클래스 변수와 안붙은 인스턴스 변수로 나눌 수 있다

```java
public class Data3 {
    public static int count;    // 클래스 변수
    public String name;         // 인스턴스 변수
}
```

- 클래스 변수(= 정적 변수, static 변수)
    - 자바 프로그램이 시작되면 단 1개만 생성, 여러 곳에 공유하는 목적으로 사용
    - 인스턴스가 생성되지 않아도 접근하여 사용이 가능하다
- 인스턴스 변수
    - 인스턴스를 생성할 때 생성되는 변수, 생성할 때 마다 새롭게 만들어 진다

## 변수와 생명 주기

- 지역 변수(매개 변수 포함) : 스택 영역의 스택 프레임 안에 보관, 메서드 종료시 같이 사라진다
- 인스턴스 변수 : 힙 영역에 보관, 프로그램이 종료 되거나 GC에 의해 제거될 때까지 생존
- 클래스 변수 : 클래스가 JVM에 로딩되는 순간 생성되어 프로그램 종료 시 까지 존재

## static 메서드

- 특정 클래스에 메서드가 인스턴스 메서드면 메서드를 사용하려면 인스턴스를 생성해야만 함
- 해당 클래스에 멤버 변수가 없으면, 불필요한 작업을 하는 결과
- 메서드에 static 을 붙여서 클래스 메서드에 바로 접근하여 사용하면 불필요한 과정을 생략 가능!

### import static

- static 메서드를 사용할 때마다, 클래스명을 적기 귀찮으면 해당 메서드를 import 하여 사용 가능

```java
// 이런 방식으로 특정 클래스의 스태틱 메서드 자체를 임포트

import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class StaticInstanceMain {
    public static void main(String[] args) {
        // 클래스명 호출 없이 바로 사용
        staticCall();
    }
}
```

## main() 메서드는 정적 메서드

- main() 은 인스턴스 생성 없이 바로 실행이 되어야 하므로 static 메서드이다
- 정적 메서드는 정적 메서드만 불러 올 수 있으므로, main() 에서 호출하는 메서드는 반드시 static 메서드여만 한다!

## 인스턴스 생성 제한

- 생성자를 private 처리해서 생성 자체를 막으면 메모리 낭비를 막을 수 있다

```java
public class MathArrUtils {

    private MathArrUtils() {
        // 인스턴스 생성을 강제로 막아서 메모리 낭비 못하게 막기
    }
}
```