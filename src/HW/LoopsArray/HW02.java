package HW.LoopsArray;

import static HW.zTools.Readers.integerReader;


public class HW02 {

    public static void HW02() {

        boolean flagPositive = true;
        int resultSum = 0;
        int resultProduct = 1;

        for (int i = 1; i < 11; i++) {
            System.out.print("Please, enter " + i + " number: ");
            int number = (integerReader());

            if (i <= 5) {
                resultSum += number;
                if (number < 0) {
                    flagPositive = false;
                }
            } else {
                resultProduct *= number;
            }
        }

        System.out.println("Flag Positive: " + flagPositive);
        if (flagPositive) System.out.println("Sum of first five numbers: " + resultSum);
        else System.out.println("Production of last five numbers: " + resultProduct);
    }
}
