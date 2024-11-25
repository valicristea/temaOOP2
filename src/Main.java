//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new VWPassat("123456789", 15);

        car.start();

        car.shiftGear(1);

        car.drive(0.01f); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02f);

        car.shiftGear(3);

        car.drive(0.5f);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(5);

        car.drive(10f);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(3);

        car.drive(0.1f);

        car.stop();

        float availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();



        Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1f);

        vehicle.stop();

        Car car = (Car) vehicle;

        float availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

    }
}