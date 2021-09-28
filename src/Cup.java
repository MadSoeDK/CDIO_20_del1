public class Cup {
    // Initialize Variables
    final int QUANTITY=2;

    int CreatedDice=0;
    int Sum=0;

    // Create Die Objects
    public Cup {
        Die Die1 = new Die();
        Die Die2 = new Die();

        Die1.RollDie();
        Die2.RollDie();
    }

    int GetSum(){
        Sum=Die1.FaceValue+Die2.FaceValue;
        return Sum;
    }
}
