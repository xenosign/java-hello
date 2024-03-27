package access.ex;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("카운터의 현재 수는 : " + counter.getCount());
    }
}
