package letureTomAndHarry.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListAssignment {
    public static int solution(String str) {
        List<Character> list = new LinkedList<>();

        for (char c : str.toCharArray()) {
            if (!list.contains(c) && c != ' ') {
                list.add(c);
            }
        }

        System.out.println(list);

        return list.size();
    }

    public static void main(String[] args) {
        String case1 = "tetz";
        String case2 = "Tetz is old";
        String case3 = "This is Assignment";
        String case4 = "이건 과제 풀이용 테스트 케이스 입니다";

        System.out.println(solution(case1));
        System.out.println(solution(case2));
        System.out.println(solution(case3));
        System.out.println(solution(case4));
    }
}
