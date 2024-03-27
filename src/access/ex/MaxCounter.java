package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (!isMax()) {
            System.out.println("최대값 초과");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isMax() {
        return count < max;
    }
}
