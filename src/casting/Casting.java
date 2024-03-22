package casting;

public class Casting {
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal;

        doubleVal = 10.9;

        // intVal = doubleVal;  에러 발생
        intVal = (int) doubleVal;
        System.out.println(intVal);

        long maxIntOver = 2147483649L;
        intVal = (int) maxIntOver;
        System.out.println(intVal); // -2147483648

        int div1 = 3 / 2;
        System.out.println(div1);

        double div2 = 3 / 2;
        System.out.println(div2);

        double div3 = 3.0 / 2;
        System.out.println(div3);

        int a = 3;
        int b = 1;
        double div4 = (double) a / b;
        System.out.println(div4);
    }
}
