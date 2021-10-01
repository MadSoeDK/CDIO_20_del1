public class Test {
    public static void main(String[] args) {
        // Initialize Variables/Attributes.
        float nr2 = 0;
        float nr3 = 0;
        float nr4 = 0;
        float nr5 = 0;
        float nr6 = 0;
        float nr7 = 0;
        float nr8 = 0;
        float nr9 = 0;
        float nr10 = 0;
        float nr11 = 0;
        float nr12 = 0;

        //Create Cup object
        Cup rafleCup = new Cup();

        //Throw dice 1000 times with for loop.
        for (int i = 0; i < 1000; i++) {
            int sum = rafleCup.getSum();
            //Check sum and thereafter count corresponding variable +1
            switch (sum) {
                case 2:
                    nr2++;
                    break;
                case 3:
                    nr3++;
                    break;
                case 4:
                    nr4++;
                    break;
                case 5:
                    nr5++;
                    break;
                case 6:
                    nr6++;
                    break;
                case 7:
                    nr7++;
                    break;
                case 8:
                    nr8++;
                    break;
                case 9:
                    nr9++;
                    break;
                case 10:
                    nr10++;
                    break;
                case 11:
                    nr11++;
                    break;
                case 12:
                    nr12++;
                    break;
                default:
                    System.out.println("Error");
            }
        }

        //Print values for each variable count
        System.out.println("Så kan gange er værdierne af øjnene registreret over 1000 kast");
        System.out.println("2: " + nr2 + " (" + nr2/10 + "%)");
        System.out.println("3: " + nr3 + " (" + nr3/10 + "%)");
        System.out.println("4: " + nr4 + " (" + nr4/10 + "%)");
        System.out.println("5: " + nr5 + " (" + nr5/10 + "%)");
        System.out.println("6: " + nr6 + " (" + nr6/10 + "%)");
        System.out.println("7: " + nr7 + " (" + nr7/10 + "%)");
        System.out.println("8: " + nr8 + " (" + nr8/10 + "%)");
        System.out.println("9: " + nr9 + " (" + nr9/10 + "%)");
        System.out.println("10: " + nr10 + " (" + nr10/10 + "%)");
        System.out.println("11: " + nr11 + " (" + nr11/10 + "%)");
        System.out.println("12: " + nr12 + " (" + nr12/10 + "%)");
    }
}
