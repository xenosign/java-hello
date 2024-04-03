package poly3.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        // 기존 인스턴스에 대한 참조를 제거
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();

        // 현 상황에서는 자동차가 늘어나는데 사용자의 코드를 계속 고쳐야 하는 문제가 발생한다
    }
}
