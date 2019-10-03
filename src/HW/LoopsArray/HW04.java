package HW.LoopsArray;

import java.util.ArrayList;
import static HW.zTools.Parity.isEven;
import static HW.zTools.Readers.integerReader;

public class HW04 {

    public static void HW04() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int counterNumber = 1;
        int number = 0;
        int arrayListSize;
        int resultProduct = 1;

        while (number >= 0) {
            System.out.print("Please, enter " + counterNumber + " number: ");
            number = (integerReader());

            if (number >= 0) {
                arrayList.add(counterNumber - 1, number);
            }

            counterNumber++;
        }

        arrayListSize = arrayList.size();
        System.out.println("Amount of numbers in ListArray: " + arrayListSize);

        if (arrayListSize > 0) {
            for (int i = 0; i < arrayListSize; i++) {
                if (isEven(arrayList.get(i))) {
                    resultProduct = resultProduct * arrayList.get(i);
                    System.out.println("Number is Even: " + arrayList.get(i));
                }
            }
            System.out.print("Result of product even numbers: " + resultProduct);
        }
    }
}
