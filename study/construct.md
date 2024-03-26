# 생성자

## 기본 생성자

- 매개 변수가 없는 생성자를 기본 생성자라 한다
- 클래스에 생성자가 하나도 없으면 자바 컴파일러가 매개 변수와 작동하는 코드가 없는 생성자를 자동으로 생성한다
- 자바 컴파일러는 클래스 내에 생성자가 하나라도 존재하면 기본 생성자를 만들지 않는다
- 자바 컴파일러가 기본적으로 생성자를 만들어주는 이유는 기본으로 생성을 안해주면 개발자가 직접 하나하나 다 선언을 해줘야 하기 때문에 편의로 제공

## 생성자 오버로딩(Overloading)과 this

- 매개 변수의 차이로 구분하는 것이 오버로딩이다
- 매개 변수의 개수, 타입에 따라서 구분이 가능
- this() 는 생성자의 첫줄에만 작성이 가능, 위반 시 컴파일 에러 발생

```java
public class MemberConstruct {
    MemberConstruct(String name, int age) {
        System.out.println("!!");
        // this() 가 2번째 줄에 사용 되었으므로 컴파일 에러 발생
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자2 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```

- 중복 되는 부분은 this 를 통해 코드를 간단하게 작성 가능하다

```java
public class MemberConstruct {
    MemberConstruct(String name, int age) {
        // this 를 이용하여 기존 생성자를 불러서 중복 해결
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자2 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```
