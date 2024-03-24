package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + " / " + studentAges[i] + " / " + studentGrades[i]);
        }
    }

    // 배열 사용의 한계, 학생 한명을 삭제하려면 정확하게 특정 데이터를 지워야 하며 학생 데이터가
    // 총 3개의 변수에서 관리되고 있어서 문제 발생의 가능성이 높다
    // 따라서 클래스를 도입하여 해결을 해야한다
}
