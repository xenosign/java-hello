package extends1.super1;

public class Child extends Parent {
    public String child = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);  // 상속을 무시하고 부모 클래스 호출

        this.hello();
        super.hello();  // 상속을 무시하고 부모 클래스 호출
    }
}
