public abstract class Car implements Vehicle {
    protected Integer fuelTankSize;
    protected String fuelType;
    protected Integer gears;
    protected Float consumptionPer100Km;
    public Float availableFuel;
    public Integer tireSize;
    private String chassisNumber;
    private Float fuelConsumed;
    private Integer curentGear;
    Car(String chassisNumber){
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start(){
        fuelConsumed = 0f;
        curentGear = 1;

    }

    @Override
    public void stop(){
        availableFuel = availableFuel - fuelConsumed;
        System.out.println("Fuel consumed is " + fuelConsumed);

    }

    @Override
    public void drive(Float km) {
        fuelConsumed = fuelConsumed + (km * 100)/consumptionPer100Km;

    }

    public void shiftGear (Integer gear){
        curentGear = gear;
    }

    public Float getAvailableFuel() {
        return availableFuel;
    }
}
