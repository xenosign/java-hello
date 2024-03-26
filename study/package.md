# 패키지

## 패키지 기본 설명

- 큰 프로그램에는 수 많은 클래스가 필요하므로 해당 클래스를 분류하기 위한 디렉토리가 패키지


- 패키지 예시
    - user
        - User
        - UserHistory
    - product
        - Product
        - ProductInit
- 패키지에 속한 클래스는 반드시 코드 첫줄에 package 패키지명; 이 나와야 한다. 안나올 경우 컴파일 에러 발생

```java
// 현재 클래스가 존재하는 패키지 명이 반드시 나와야 함, 안그러면 컴파일 에러
package pack;

public class Data {
    public Data() {
        System.out.println("패키지 생성");
    }
}
```

- 생성자에 public 을 사용하는 이유는 다른 패키지에서 해당 클래스의 생성자를 호출하려면 public 이 필요함

## 패키지 위치에 따른 처리

- 동일한 패키지에 속한 클래스는 바로 호출 가능
- 다른 패키지에 속한 클래스를 호출 하려면 반드시 위치를 표기

```java
public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();

        // 다른 패키지의 클래스를 호출 하려면 패키지 위치를 적어줘야만 한다
        pack.a.User user = new pack.a.User();
    }
}
```

### import 사용

- import 를 사용하여 클래스의 위치를 명시하고 사용 가능
- 혹은 * 를 사용하여 패키지 내부의 모든 클래스 호출 가능

```java
import pack.a.User;
// import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();

        // import 로 패키지 위치를 명시하고 사용 가능
        User user = new User();
    }
}
```

### 다른 패키지에 같은 클래스명이 존재하는 경우

- 적어도 다른 하나의 패키지는 위치를 명시 해줘야 함

```java
import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 다른 패키지에 위치하는 같은 클래스명을 사용하고 싶으면, 하나는 패키지의 위치를 명시 해줘야 한다
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
```

## 패키지의 규칙

- 패키지의 이름과 위치는 폴더 위치와 같아야 한다(필수)
- 패키지의 이름은 모두 소문자 사용(관례)
    - OS 따라 대소문자 구분이 안되는 경우가 있음
- 패키지 이름의 앞부분은 회사의 도메인 이름을 거꾸로 사용(관례)
    - com.google.mypackage
    - 라이브러리 사용시 패키지 명이 겹칠 수 있으므로, 회사명으로 구분

### 패키지의 계층 구조

- a
    - b
    - c

- 위와 같이 계층 구조를 가진 패키지는 a, a.b, a.c 의 총 3개의 패키지가 존재
- 위의 패키지는 계층 구조만을 가질 뿐이지 서로 완전히 다른 패키지로 처리 된다
- 따라서, a 에서 a.b 의 패키지의 클래스가 필요하면 import 가 필요

## 패키지 활용

- 예시 구조
- com
    - helloshop
        - order
            - Order
            - OrderService
        - product
            - Product
        - user
            - User

- 패키지 작성 시, com.helloshop 같을 것을 입력하면 알아서 패키지로 구분
       


