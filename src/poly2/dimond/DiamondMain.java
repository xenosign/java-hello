package poly2.dimond;

public class DiamondMain {
    public static void main(String[] args) {
        // InterfaceA 에 정의된 메서드만 사용가능
        InterfaceA childA = new Child();
        childA.methodA();
        childA.methodCommon();

        // InterfaceB 에 정의된 메서드만 사용가능
        InterfaceB childB = new Child();
        childB.methodB();
        childB.methodCommon();

        // 모든 메서드 사용 가능
        Child childC = new Child();
        childC.methodA();
        childC.methodB();
        childC.methodCommon();
    }
}
