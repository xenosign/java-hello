package poly3.car1;

public class Driver {
    private Car car;

    // setter 가 필요한 이유! 인스턴스 참조 주소를 결정해 줘야만 하므로
    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
