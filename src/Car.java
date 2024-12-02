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
    private Float drivenDistance;
    Car(String chassisNumber){
        this.chassisNumber = chassisNumber;
    }

    /**
     * Initializes the fuelConsumed, currentGear and drivenDistance values
     */
    @Override
    public void start(){
        fuelConsumed = 0f;
        curentGear = 1;
        drivenDistance=0f;

    }

    /**
     * Determine the availableFuel value.
     * Print the fuelConsumed during drive
     */
    @Override
    public void stop(){
        availableFuel = availableFuel - fuelConsumed;
        System.out.println("Fuel consumed is " + fuelConsumed);

    }

    /**
     * Determined the fuelConsumed and drivenDistance values based on the given param
     * @param km - the driven distance
     */
    @Override
    public void drive(Float km) {
        fuelConsumed = fuelConsumed + km * (consumptionPer100Km/100);
        drivenDistance = drivenDistance + km;

    }

    /**
     * Changes the gear
     * @param gear - the gear to change to
     */
    public void shiftGear (Integer gear){
        curentGear = gear;
    }

    /**
     * @return the availableFuel value
     */
    public Float getAvailableFuel() {
        return availableFuel;
    }

    /**
     * Computes the averageFuelConsumption for the current drive
     * @return averageFuelConsumption value
     */
    public Float getAverageFuelConsumption(){
        return fuelConsumed*100/drivenDistance;
    }
}
