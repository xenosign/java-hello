package tomAndHarry.assignment;

import java.util.LinkedList;

public class Assignment03 {
    static class Student {
        String name;
        String major;

        public Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }


        @Override
        public String toString() {
            return String.format("이름: %s, 전공: %s", name, major);
        }
    }

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        // 학생 추가
        students.add(new Student("문준일", "전기전자"));
        students.add(new Student("정지희", "소프트웨어"));
        students.add(new Student("최규찬", "전기전자"));
        students.add(new Student("김이수", "산업디자인"));
        students.add(new Student("임준수", "전기전자"));

        System.out.println("전공이 전기전자인 이상 학생 목록 : ");
        solution(students);
    }

    public static void solution(LinkedList<Student> students) {
        for (Student student : students) {
            if (student.getMajor().equals("전기전자")) {
                System.out.println(student);
            }
        }
    }
}