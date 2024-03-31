package poly3.ex3;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;

        System.out.println("----------------------------------------------------------");
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option);

        // null 을 통한 분기 처리가 사라짐
        // if (pay != null) {
        //     pay.pay(amount);
        // } else {
        //     System.out.println("결제 수단이 없습니다");
        //     result = false;
        // }

        result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공 했습니다");
        } else {
            System.out.println("결제가 실패 했습니다");
        }
    }
}
