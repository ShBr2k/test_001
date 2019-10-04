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

import java.text.SimpleDateFormat;
import java.util.Date;

import static HW.zTools.Readers.stringReader;


/**
 * Class HW05 - main for current task
 *
 * @author Roman Shamakhin
 * @version 0.10 04 Oct 2019
 */

public class HW05 {

    /**
     * The Car class provide creation instance, setting and getting access to
     * the fields a class
     */
    class Car {
        private String Type;            // Type of Car
        private Date YearProduction;    // Year production of Car, type is Date
        private float EngineCapacity;   // Engine Capacity

        /** Constructor Car provide creation of default instance */
        private Car() {
        }

        /** Method setType provide setting value type for instance */
        private void setType(String type) {
            this.Type = type;
        }

        /** Method setYearProduction provide setting value yearProduction for instance */
        private void setYearProduction(Date yearProduction) {
            this.YearProduction = yearProduction;
        }

        /** Method setEngineCapacity provide setting value EngineCapacity for instance */
        private void setEngineCapacity(float engineCapacity) {
            this.EngineCapacity = engineCapacity;
        }

        /** Method getType provide reading value Type of instance */
        private String getType() {
            return this.Type;
        }

        /** Method getYearProduction provide reading value YearProduction of instance */
        private Date getYearProduction() {
            return this.YearProduction;
        }

        /** Method getEngineCapacity provide reading value EngineCapacity of instance */
        private float getEngineCapacity() {
            return this.EngineCapacity;
        }
    }

    /** Method runHW05 provide execution of task */
    public void runHW05() throws Exception {

        Date yearProduction;            // Year production of Car, type is Date

        Car[] arrayCar = new Car[4];    // Create array of instances

        /* Create instance #1 of class Car, fill fields of instance,fill array of instances*/
        System.out.print("Input Year for Car#1: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car01 = new Car();
        car01.setType("A");
        car01.setYearProduction(yearProduction);
        car01.setEngineCapacity(1.1f);
        arrayCar[0] = car01;

        /* Create instance #2 of class Car, fill fields of instance,fill array of instances*/
        System.out.print("Input Year for Car#2: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car02 = new Car();
        car02.setType("B");
        car02.setYearProduction(yearProduction);
        car02.setEngineCapacity(1.2f);
        arrayCar[1] = car02;

        /* Create instance #3 of class Car, fill fields of instance,fill array of instances*/
        System.out.print("Input Year for Car#3: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car03 = new Car();
        car03.setType("C");
        car03.setYearProduction(yearProduction);
        car03.setEngineCapacity(1.3f);
        arrayCar[2] = car03;

        /* Create instance #4 of class Car, fill fields of instance,fill array of instances*/
        System.out.print("Input Year for Car#4: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car04 = new Car();
        car04.setType("D");
        car04.setYearProduction(yearProduction);
        car04.setEngineCapacity(1.4f);
        arrayCar[3] = car04;

        /* Show elements of array before sorting*/
        System.out.println("List of cars before sorting:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Type of car #" + i + ": " + arrayCar[i].getType() + ". Year of production: " + String.format("%tY", arrayCar[i].getYearProduction()) + ". Engine capacity: " + arrayCar[i].getEngineCapacity());
        }

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
                j--;
            }
        }
        // try to use  Arrays.sort(arrayCar);

        /* Show elements of array after sorting*/
        System.out.println("List of cars after sorting:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Type of car #" + i + ": " + arrayCar[i].getType() + ". Year of production: " + String.format("%tY", arrayCar[i].getYearProduction()) + ". Engine capacity: " + arrayCar[i].getEngineCapacity());
        }

    }
}
