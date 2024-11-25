public abstract class Mercedes extends Car {

    Mercedes(String chassisNumber,
               Integer fuelTankSize,
               String fuelType,
               Integer gears,
               Float consumptionPer100KM) {
        super(chassisNumber);
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100KM;
    }
}
