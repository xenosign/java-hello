package extends1.ex2;

import extends1.ex2.ElectricCar;
import extends1.ex2.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        electricCar.move();
        electricCar.openDoor();
        electricCar.charge();

        gasCar.move();
        gasCar.openDoor();
        gasCar.fillUp();

        hydrogenCar.move();
        hydrogenCar.openDoor();
        hydrogenCar.fillHyrogen();
    }
}
