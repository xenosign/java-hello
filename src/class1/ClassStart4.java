package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        // 인스턴스를 저장하는 변수는 참조값을 가지고 있으므로, 해당 값을 복사하는 경우 인스턴스 전체 값을 복사하는 것 X
        // 인스턴스의 참조 주소만을 복사한다
    }
}
