package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        System.out.println(student1.name + " / " + student1.age + " / " + student1.grade);

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student2.name + " / " + student2.age + " / " + student2.grade);

        // 사용자가 직접 정의하는 사용자 정의 타입을 만드려면 설계도가 필요하다. 이 설계도가 바로 클래스이다
        // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다
        // 객체는 좀 더 제너럴한 이름이고, 인스턴스는 클래스로 생성된 객체를 정확하게 의미한다
        // 클래스 : 붕어빵 틀, 인스턴스 : 붕어빵

        // new 를 쓰면 특정 메모리에 새로운 객체를 생성하라는 뜻
        // 자바가 설계도를 보고 해당 설계도에 필요한 필드를 위한 메모리도 함께 확보한다
        // 그리고 해당 인스턴스에는 생성된 메모리의 참조 값을 보관시킨다 -> 접근을 위해
        // 실제로 인스턴스를 출력하면 
        // class1.Student@30f39991 처럼 나오는데, 패키지명.클래스명@참조주소 순서이다
    }
}
