# 형변환

## 암묵적 형변환

- 작은 데이터 타입에서 큰 데이터로 가는 것은 문제가 없다
- 데이터 타입이 다르거나 반대의 경우는 에러 발생

```java
public static void main(String[] args) {
    int intVal = 10;
    long longVal;
    double doubleVal;

    longVal = intVal;
    doubleVal = intVal;
}
```

- 실제로는 () 가 들어간 형변환이 자동으로 적용 되는 것

```java
public static void main(String[] args) {
    int intVal = 10;
    long longVal;
    double doubleVal;

    longVal = (long) intVal;
    doubleVal = (double) intVal;
}
```

## 명시적 형변환

- 단, () 를 사용해서 명시적 형변환을 하면 에러 없이 변환 가능
- 실수를 정수로 담으면 버림으로 처리

```java
public static void main(String[] args) {
    int intVal = 10;
    double doubleVal;

    doubleVal = 10.5;

    // intVal = doubleVal; 에러 발생
    intVal = (int) doubleVal; // 10
}
```

- 작은 범위를 넘어가는 숫자를 담으면 오버플로우로 인해 가장 작은 값부터 올라간다

```java
public static void main(String[] args) {
    long maxIntOver = 2147483648L;
    intVal = (int) maxIntOver;
    System.out.println(intVal); // -2147483648

    long maxIntOver = 2147483649L;
    intVal = (int) maxIntOver;
    System.out.println(intVal); // -2147483647
}
```

- 같은 타입의 계산은 같은 타입의 결과를 낸다
- 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다

```java
public static void main(String[] args) {
    int div1 = 3 / 2;
    System.out.println(div1); // 1

    double div2 = 3 / 2;
    System.out.println(div2); // 1

    double div3 = 3.0 / 2;
    System.out.println(div3); // 1.5

    int a = 3;
    int b = 1;
    double div4 = (double) a / b;
    System.out.println(div4); // 1.5
}
```