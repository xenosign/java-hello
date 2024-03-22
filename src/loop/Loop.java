package loop;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

//        while (count < 3) {
//            sum += ++count;
//            System.out.println(sum);
//        }
//
//        do {
//            sum += ++count;
//            System.out.println(sum);
//        } while (sum < 10);

        count = 0;
        sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(sum);
        }

        count = 0;
        sum = 0;

        for (; ; ) {
            if (sum > 200) break;
            sum += count++;
            System.out.println(sum);
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j);
            }
        }

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }


    }
}
