package tomAndHarry.collection.set;


import java.util.Set;
import java.util.TreeSet;

public class SetExample3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "역삼역";

        System.out.println(removeDuplicateLetters(str1)); // -> helo
        System.out.println(removeDuplicateLetters(str2)); // -> world
        System.out.println(removeDuplicateLetters(str3)); // -> 역삼
    }

    static String removeDuplicateLetters(String s) {
        Set<Character> set = new TreeSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        String result = "";
        for (char c : set) {
            result += c;
        }

        return result;
    }
}
