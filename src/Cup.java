public class Cup {

    // Initialize Variables
    private final int QUANTITY=2;
    private int sum;

    Die Die1;
    Die Die2;

    // Create Die Objects
    public Cup() {
        Die1 = new Die();
        Die2 = new Die();
    }

    int getSum() {
        sum = Die1.getFacevalue() + Die2.getFacevalue();
        return sum;
    }
}

