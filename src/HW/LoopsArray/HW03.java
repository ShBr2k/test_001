package HW.LoopsArray;

import static HW.zTools.Readers.integerReader;

public class HW03 {

    public static void HW03() {
        int array[] = new int[5];
        int counterPositive = 0;
        int minNumber = array[0];
        int positionMinNumber = 0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Please, enter " + i + " number: ");
            int number = (integerReader());
            array[i-1] = number;
        }

        for (int i = 1; i < 6; i++) {
            if ((array[i-1] > 0)){
                if (++counterPositive == 2)
                {
                    System.out.println("Position for second positive number is: " + i );
                }
            }
        }

        for (int i = 1; i < 6; i++) {
            if ((array[i-1] < minNumber)){
                minNumber = array[i-1];
                positionMinNumber = i;
            }
        }
        System.out.println("Min number is: " + minNumber );
        System.out.println("Position of min number is: " + positionMinNumber);
    }
}
