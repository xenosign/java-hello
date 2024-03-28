package overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        electricCar.move();
        gasCar.move();
        hydrogenCar.move();
    }
}
