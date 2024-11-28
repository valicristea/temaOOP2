public class VWGolf extends Volkswagen{

    VWGolf(String chassisNumber, Integer tyreSize) {
        super(chassisNumber, 65, "gasoline", 5, 11.5f);
        this.tireSize = tyreSize;
    }
}
