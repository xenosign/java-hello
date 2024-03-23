package method;

public class Method1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int sum = add(a, b);

        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
