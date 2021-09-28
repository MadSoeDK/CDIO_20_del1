import java.util.Random;

public class Die {

    // Initialize Random Object
    Random rand = new Random();

    // Initialize Variables
    private final int MAXVALUE=6;
    private int facevalue= rand.nextInt(MAXVALUE)+1;

    public Die (){
        facevalue = rand.nextInt(MAXVALUE)+1;
        System.out.println(facevalue);
    }

    public int getFacevalue() {
        return facevalue;
    }
}
