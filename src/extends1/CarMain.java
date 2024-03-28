package extends1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar car = new GasCar();
        car.move();
        car.fillUp();
    }
}
