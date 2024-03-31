package poly3.ex3;

// 특정 조건을 위한 클래스를 만들어서 null 을 통한 분기 처리를 없애는 방법
public class FailurePay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다!");
        return false;
    }
}
