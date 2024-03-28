package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C " + counter.count);
    }

    // Data2 클래스에 대한 카운트를 알고 싶지만 외부에 별도의 클래스를 만들어서 관리해야 하는 단점 존재
    // 또한 Counter 클래스를 매번 전달해야하는 귀찮음 발생
}
