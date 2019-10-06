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
import java.util.Arrays;
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
     * The Car class provide creation instance, setting and getting access to
     * the fields a class
     */
    private class Car {
        private String Type;            // Type of Car
        private Date YearProduction;    // Year production of Car, type is Date
        private float EngineCapacity;   // Engine Capacity

        /**
         * Constructor Car provide creation of instances
         */
        private Car() {
        }

        /**
         * Method setType provide setting value type for instance
         */
        private void setType(String type) {
            this.Type = type;
        }

        /**
         * Method setYearProduction provide setting value yearProduction for instance
         */
        private void setYearProduction(Date yearProduction) {
            this.YearProduction = yearProduction;
        }

        /**
         * Method setEngineCapacity provide setting value EngineCapacity for instance
         */
        private void setEngineCapacity(float engineCapacity) {
            this.EngineCapacity = engineCapacity;
        }

        /**
         * Method getInformation provide reading all values of instance
         */
        private String getInformation(int numberCar) {
            String returnInformation = "Type of car #" + numberCar + ": " + this.getType() +
                    ". Year of production: " + String.format("%tY", this.getYearProduction()) +
                    ". Engine capacity: " + this.getEngineCapacity();
            return returnInformation;
        }

        /**
         * Method getType provide reading value Type of instance
         */
        private String getType() {
            return this.Type;
        }

        /**
         * Method getYearProduction provide reading value YearProduction of instance
         */
        private Date getYearProduction() {
            return this.YearProduction;
        }

        /**
         * Method getEngineCapacity provide reading value EngineCapacity of instance
         */
        private float getEngineCapacity() {
            return this.EngineCapacity;
        }
    }

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
            // Checking for corrected of value of Year
            try {
                Date yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
                arrayCar[i] = new Car();
                arrayCar[i].setType(Character.toString((char) (i + 65)));
                arrayCar[i].setYearProduction(yearProduction);
                arrayCar[i].setEngineCapacity(1 + i * 0.1f);
            } catch (ParseException e) {
                System.out.println("Value is not Year.");
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
