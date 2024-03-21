package cond;

public class If {
    public static void main(String[] args) {
        double age = Math.floor(Math.random() * 30);

        System.out.println(age);

        if (age >= 18) {
            System.out.println("성인 입니다");
        } else if (age <= 7) {
            System.out.println("미취학 입니다");
        } else {
            System.out.println("미성년 입니다");
        }
    }
}
