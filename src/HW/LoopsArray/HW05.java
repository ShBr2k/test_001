/*
 * Copyright (c) Roman Shamakhin.
 * Filename: HW05
 * This software is Home Word Demo:
 * Create class Car with fields type, year of production and engine capacity.
 * Create and initialize four instances of class Car.
 * Display cars certain model year (enter year in the console);
 * ordered by the field year.
 */
package HW.LoopsArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static HW.zTools.Readers.stringReader;


/**
 * Class HW05 - main for current task
 *
 * @author Roman Shamakhin
 * @version 0.11 04 Oct 2019
 */

public class HW05 {

    private Car[] arrayCar = new Car[4];    // Create array of instances

    /**
     * Method readArrayCar provide showing information of instances from arrayCar
     */
    private void readArrayCar(int lengthArrayCar) {
        for (int i = 0; i < lengthArrayCar; i++) {
            System.out.println(arrayCar[i].getInformation(i + 1));
        }
    }

    /**
     * Method runHW05 provide execution of task
     */
    public void runHW05() {

        /* Filling array of instances of class Car, value yearProduction input by console,
           values type, engineCapacity is calculated */
        for (int i = 0; i < arrayCar.length; i++) {
            System.out.print("Input Year of Production Car #" + (i + 1) + ": ");
            // Checking for correct of value of Year
            try {
                Date yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
                arrayCar[i] = new Car();
                arrayCar[i].setType(Character.toString((char) (i + 65)));
                arrayCar[i].setYearProduction(yearProduction);
                arrayCar[i].setEngineCapacity(1 + i * 0.1f);
            } catch (ParseException e) {
                System.out.println("Entered value is not Year.");
                System.exit(0);
            } finally {
            }
        }

        /* Showing elements of array before sorting */
        System.out.println(System.lineSeparator() + "List of cars before sorting:");
        readArrayCar(arrayCar.length);

        /* Do sorting elements of YearProduction field of array by ascending. Use algorithm 'Sorting by inclusion | Insertion sort'. */
        Car curCar = new Car();                 // Create temporary instance of class Car
        Car tmpCar = new Car();                 // Create temporary instance of class Car

        for (int i = 1; i < 4; i++) {           // External loop
            curCar = arrayCar[i];               // Save current instance
            int j = i;
            while ((j > 0) && (arrayCar[j - 1].getYearProduction().compareTo(curCar.getYearProduction()) > 0)) {
                // loop is repeated unit reach first element of array and instance [i] greater than instance [j-1]
                tmpCar = arrayCar[j];           // Save temporary instance from array [j]
                arrayCar[j] = arrayCar[j - 1];  // Move instance in array from [j-1] to [j]
                arrayCar[j - 1] = tmpCar;       // Restore temporary instance to [j-1]
                j--;                            // use previous index
            }
        }

        // try to use Arrays.sort(arrayCar);

        /* Showing elements of array after sorting */
        System.out.println(System.lineSeparator() + "List of cars after sorting:");
        readArrayCar(arrayCar.length);
    }
}
