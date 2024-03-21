# switch 문

## 자바 14 이상 버전에서 도입된 switch 문

```java
int coupon2 = switch (grade) {
    case 1 -> 1000;
    case 2 -> 2000;
    default -> 3000;
};
```