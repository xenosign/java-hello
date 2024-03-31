package poly3.ex1;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS을 발송합니다 : " + msg);
    }
}
