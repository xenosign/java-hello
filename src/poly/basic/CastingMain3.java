package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;    // 생략하지 않고 작성
        Parent parent2 = child;             // 생략 하고 작성
    }
}
