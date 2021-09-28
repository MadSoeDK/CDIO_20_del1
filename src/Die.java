import java.util.Random;

public class Die {

    // Initialize Random Object
    Random rand = new Random();

    // Initialize Variables
    final int MAXVALUE=6;
    int facevalue=rand.nextInt(MAXVALUE)+1;

    int roll (){
        facevalue = rand.nextInt(MAXVALUE)+1;
        System.out.println(facevalue);
        return facevalue;
    }
}
