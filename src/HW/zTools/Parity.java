package HW.zTools;

public class Parity {

    public static boolean isOdd(int value) {
        boolean result;

        if (value % 2 == 0) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }

    public static boolean isEven(int value) {
        boolean result;

        if (value % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
