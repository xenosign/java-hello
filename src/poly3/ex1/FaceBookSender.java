package poly3.ex1;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북 메시지를 발송합니다 : " + msg);
    }
}
