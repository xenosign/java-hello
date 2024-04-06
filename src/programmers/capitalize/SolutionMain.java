package programmers.capitalize;

import java.util.Scanner;

public class SolutionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";

        char tmp;

        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);

            if (Character.isUpperCase(tmp)) output += Character.toLowerCase(tmp);
            else output += Character.toUpperCase(tmp);
        }

        System.out.println(output);
    }
}