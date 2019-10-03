package HW.LoopsArray;

import static HW.zTools.Readers.integerReader;


public class HW01 {

    public static void HW01() {

        int monthDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Please, enter a number of month: ");
        int numberMonth = (integerReader());
        if (numberMonth < 1 || numberMonth > 12) {
            System.out.println("Wrong number of month.");
        } else {
            int countDay = monthDay[numberMonth - 1];
            System.out.println("In month #" + numberMonth + " days: " + countDay);
        }
    }
}
