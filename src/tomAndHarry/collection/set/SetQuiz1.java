package tomAndHarry.collection.set;


import java.util.HashSet;
import java.util.Set;

public class SetQuiz1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(checkDuplicateLetters(str1)); // true
        System.out.println(checkDuplicateLetters(str2)); // false
    }

    static boolean checkDuplicateLetters(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) return true;
            set.add(c);
        }

        return false;
    }
}
