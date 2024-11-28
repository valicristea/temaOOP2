public class MercedesEQS extends Mercedes{

    MercedesEQS(String chassisNumber, Integer tyreSize) {
        super(chassisNumber, 80, "hydrogen", 1, 17.5f);
        this.tireSize = tyreSize;
    }
}
