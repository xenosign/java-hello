package letureTomAndHarry.recursion.factorial;

public class FactorialConsole {
    private static int depth = 0;
    private static final String INDENT = "    ";

    public static int factorial(int n) {
        printEnter(n, "팩토리얼");
        depth++;

        int result;
        if (n <= 1) {
            printCalculation(n, "기본 케이스: 1을 반환합니다");
            result = 1;
        } else {
            printCalculation(n, n + " * factorial(" + (n - 1) + ") 계산이 필요합니다");
            result = n * factorial(n - 1);
            printCalculation(n, "계산 완료: " + n + " * " + (result / n) + " = " + result);
        }

        depth--;
        printExit(n, "팩토리얼", result);
        return result;
    }

    private static void printEnter(int n, String methodName) {
        System.out.println(getIndent() + "→ " + methodName + "(" + n + ") 함수 진입");
    }

    private static void printExit(int n, String methodName, int result) {
        System.out.println(getIndent() + "← " + methodName + "(" + n + ") 함수 종료, 반환값: " + result);
    }

    private static void printCalculation(int n, String message) {
        System.out.println(getIndent() + "  " + message);
    }

    private static String getIndent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(INDENT);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("팩토리얼(4) 계산 시작:");
        System.out.println("스택 호출 과정 시각화:\n");
        int result = factorial(4);
        System.out.println("\n최종 결과: " + result);
    }
}