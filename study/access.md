# 접근 제어자

- public, private 등으로 클래스 외부에서 필드나 메서드에 대한 접근을 허용하거나 제한하는 것

## Speaker 예시

- 볼륨이 100을 넘으면 폭발하는 스피커가 있어서 클래스 내부에 볼륨을 100으로 제한하는 기능 삽입

```java
public class Speaker {
    int volume = 0;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨 최대치");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가 합니다");
        }
    }
}
```

- 하지만 volume 필드는 외부에서 접근이 가능하므로 사용자가 직접 접근해서 값을 지정하면 100 제한이 아무런 의미가 없어지게 됨

```java
public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        // 필드에 직접 접근, 이로 인하여 volume 상한선 100을 사용자가 마음대로 지정하여 문제가 발생한다
        speaker.volume = 200;
        speaker.showVolume();
    }
}
```

- 따라서 접근 제어자를 사용하여 외부에서의 접근을 제어할 필요가 있음

### private 접근 제어자

- volume 필드에 private 접근 제어자를 사용하면 해당 필드는 해당 클래스 내부에서만 접근이 가능해진다
- 즉 SpeakerMain 클래스는 외부 클래스 이므로 해당 필드에 직접 접근이 불가능

```java
public class Speaker {
    private int volume = 0;
}
```

## 접근 제어자의 종류

- private : 모든 외부 호출을 막는다
    - 클래스 안으로 속성을 숨길 때
- default(package-private) : 같은 패키지 안에서의 호출은 허용
    - 패키지 안으로 속성을 숨길 때
- protected : 같은 패키지 안에서의 호출은 허용, 패키지가 다를 경우 상속 관계만 허용
    - 상속 관계로 속성을 숨길 때
- public : 모든 외부 호출을 허용
    - 모든 곳에 공개할 때

## 접근 제어자의 사용 위치

- 필드, 메서드, 생성자에 사용
- 클래스 레벨에서도 사용이 가능하다 추후에 배운다
- 지역 변수는 어짜피 지역적 접근만 가능하므로 접근 제어자 사용이 불가능

## 필드, 메서드 레벨의 접근 제어자

- 여기서 부터는 패키지 위치가 매우 중요하므로 주의 필요
- 생성자도 필드, 메서드와 동일한 매커니즘으로 동작한다

## 클래스 레벨의 접근 제어자

- 클래스 레벨의 접근 제어자는 public, default 만 사용 가능
    - private, protected 는 사용 불가
- public 클래스는 반드시 파일명과 이름이 같아야 한다
    - 하나의 자바 파일에 public 클래스는 하나만 있어야 한다
    - default 는 무한히 만들 수 있다

### 패키지가 다른 경우 어찌 되는가

- 패키지 다를 경우 default 클래스를 강제로 import 해와도 컴파일 에러가 발생한다

```java
// 강제 import

import access.a.DefaultClass1;
import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 패키지 위치가 다르므로 default 클래스 호출 불가능
        // 강제로 import 를 해도 컴파일 에러가 발생한다
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
```
