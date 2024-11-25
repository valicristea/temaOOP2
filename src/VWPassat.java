public class VWPassat extends Volkswagen{

    VWPassat(String chassisNumber, Integer tyreSize) {
        super(chassisNumber, 50, "diesel", 6, 6.5f);
        this.tireSize = tyreSize;
    }
}
