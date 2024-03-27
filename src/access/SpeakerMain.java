package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();

        speaker.volumeDown();
        speaker.showVolume();

        // 필드에 직접 접근, 이로 인하여 volume 상한선 100을 사용자가 마음대로 지정하여 문제가 발생한다
        // ∑speaker.volume = 200;
        speaker.showVolume();
    }
}
