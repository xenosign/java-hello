package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        parent.parentMethod();

        Child child = new Child();
        System.out.println("Child -> Child");
        child.childMethod();

        // 부모가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Child -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
