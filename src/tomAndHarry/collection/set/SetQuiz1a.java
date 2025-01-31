package tomAndHarry.collection.set;


import java.util.HashSet;

public class SetQuiz1a {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(checkDuplicateLetters(str1));
        System.out.println(checkDuplicateLetters(str2));
    }

    static boolean checkDuplicateLetters(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) return true;
            set.add(c);
        }

        return false;
    }
}
