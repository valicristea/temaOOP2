public abstract class Volkswagen extends Car {

    Volkswagen(String chassisNumber,
               Integer fuelTankSize,
               String fuelType,
               Integer gears,
               Float consumptionPer100KM) {
        super(chassisNumber);
        this.fuelTankSize = fuelTankSize;
        this.availableFuel = fuelTankSize.floatValue();
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100KM;
    }
}
