# 입력 받기

## scanner 을 사용한 입력

- java 라이브러리 Scanner 클래스를 이용하여 입력 받기
- 데이터 타입에 따라 다른 메서드로 입력을 받아야 함, 물론 변수도 같은 데이터 타입이어야 함

```java
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intVal = scanner.nextInt();
        System.out.println("입력한 숫자 : " + intVal);

        System.out.print("실수를 입력하세요 : ");
        double doubleVal = scanner.nextDouble();
        System.out.println("입력한 숫자 : " + doubleVal);
    }
}
```