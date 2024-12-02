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
        System.out.println("The VW Passat:available fuel " + availableFuel +" fuelConsumedPer100km " + fuelConsumedPer100Km);
        System.out.println("-----------------------------------------------------------");



        Vehicle vehicle = new VWGolf ( "1987ddkshik289", 16); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1f);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        float availableFuel2 = car2.getAvailableFuel();

        float fuelConsumedPer100Km2 = car2.getAverageFuelConsumption();
        System.out.println("The VW Golf:available fuel " + availableFuel2 +" fuelConsumedPer100km " + fuelConsumedPer100Km2);
        System.out.println("-----------------------------------------------------------");



        Vehicle vehicle3 = new MercedesEQA ( "xxxxxxxxxxxxxxxxx", 17); // available fuel and chassis number

        vehicle3.start();

        vehicle3.drive(17f);

        vehicle3.stop();

        Car car3 = (Car) vehicle3;

        float availableFuel3 = car3.getAvailableFuel();

        float fuelConsumedPer100Km3 = car3.getAverageFuelConsumption();
        System.out.println("The Mercedes EQA:available fuel " + availableFuel3 +" fuelConsumedPer100km " + fuelConsumedPer100Km3);
        System.out.println("-----------------------------------------------------------");



        Vehicle vehicle2 = new MercedesEQS( "ASASASAASASASASASAS", 18); // available fuel and chassis number

        vehicle2.start();

        vehicle2.drive(37f);

        vehicle2.stop();

        Car car4 = (Car) vehicle2;

        float availableFuel4 = car4.getAvailableFuel();

        float fuelConsumedPer100Km4 = car4.getAverageFuelConsumption();
        System.out.println("The Mercedes EQS:available fuel " + availableFuel4 +" fuelConsumedPer100km " + fuelConsumedPer100Km4);
        System.out.println("-----------------------------------------------------------");

    }
}