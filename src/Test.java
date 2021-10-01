public class Test {
    public static void main(String[] args) {
        // Initialize Variables/Attributes.
        int nr2 = 0;
        int nr3 = 0;
        int nr4 = 0;
        int nr5 = 0;
        int nr6 = 0;
        int nr7 = 0;
        int nr8 = 0;
        int nr9 = 0;
        int nr10 = 0;
        int nr11 = 0;
        int nr12 = 0;

        //Create Cup object
        Cup rafleCup = new Cup();

        //Throw dice 1000 times with forloop. Check value and thereafter count corrosponding variable +1
        for (int i = 0; i < 10000; i++) {
            int j = rafleCup.getSum();
            switch (j) {
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
        System.out.println("Så kan gange er værdierne af øjnene registreret over 1000 kast");
        System.out.println("2: " + nr2 + " (" + nr2/100 + "%)");
        System.out.println("3: " + nr3 + " (" + nr3/100 + "%)");
        System.out.println("4: " + nr4 + " (" + nr4/100 + "%)");
        System.out.println("5: " + nr5 + " (" + nr5/100 + "%)");
        System.out.println("6: " + nr6 + " (" + nr6/100 + "%)");
        System.out.println("7: " + nr7 + " (" + nr7/100 + "%)");
        System.out.println("8: " + nr8 + " (" + nr8/100 + "%)");
        System.out.println("9: " + nr9 + " (" + nr9/100 + "%)");
        System.out.println("10: " + nr10 + " (" + nr10/100 + "%)");
        System.out.println("11: " + nr11 + " (" + nr11/100 + "%)");
        System.out.println("12: " + nr12 + " (" + nr12/100 + "%)");
    }
}
