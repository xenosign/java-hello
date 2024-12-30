package letureTomAndHarry.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAssignment2 {
    public static void solution(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("김연비", "남양주"));
        studentList.add(new Student("김시완", "강서구"));
        studentList.add(new Student("김시완", "은평구"));
        solution(studentList);
    }
}
