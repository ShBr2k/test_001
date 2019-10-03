package HW.LoopsArray;

import java.text.SimpleDateFormat;
import java.util.Date;
import static HW.zTools.Readers.stringReader;

public class HW05 {

    static class Car {
        private String Type;
        private Date YearProduction;
        private float EngineCapacity;

        public Car() {
        }

        public void setType(String type) {
            this.Type = type;
        }

        public void setYearProduction(Date yearProduction) {
            this.YearProduction = yearProduction;
        }

        public void setEngineCapacity(float engineCapacity) {
            this.EngineCapacity = engineCapacity;
        }

        public String getType() {
            return this.Type;
        }

        public Date getYearProduction() {
            return this.YearProduction;
        }

        public float getEngineCapacity() {
            return this.EngineCapacity;
        }
    }


    public static void HW05() throws Exception {

        Date yearProduction;

        Car[] arrayCar = new Car[4];

        System.out.print("Input Year for Car#1: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car01  = new Car();
        car01.setType("A");
        car01.setYearProduction(yearProduction);
        car01.setEngineCapacity(1.1f);
        arrayCar[0] = car01;

        System.out.print("Input Year for Car#2: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car02  = new Car();
        car02.setType("B");
        car02.setYearProduction(yearProduction);
        car02.setEngineCapacity(1.2f);
        arrayCar[1] = car02;

        System.out.print("Input Year for Car#3: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car03  = new Car();
        car03.setType("C");
        car03.setYearProduction(yearProduction);
        car03.setEngineCapacity(1.3f);
        arrayCar[2] = car03;

        System.out.print("Input Year for Car#4: ");
        yearProduction = new SimpleDateFormat("yyyy").parse(stringReader());
        Car car04  = new Car();
        car04.setType("D");
        car04.setYearProduction(yearProduction);
        car04.setEngineCapacity(1.4f);
        arrayCar[3] = car04;

        System.out.println("List of cars before sorting:");
        for (int i = 0; i<4; i++) {
            System.out.println("Type of car #" + i + ": " + arrayCar[i].getType() + ". Year of production: " + String.format("%tY", arrayCar[i].getYearProduction()) + ". Engine capacity: " + arrayCar[i].getEngineCapacity());
        }

        Car curCar = new Car();
        Car tmpCar = new Car();

        for (int i = 1; i < 4; i++)
        {
            curCar = arrayCar[i];
            int j = i;
            while ((j > 0) && (arrayCar[j-1].getYearProduction().compareTo(curCar.getYearProduction())>0))
            {
                tmpCar = arrayCar[j];
                arrayCar[j] = arrayCar[j-1];
                arrayCar[j-1] = tmpCar;
                j = j - 1;
            }
            arrayCar[j] = curCar;
        }

        System.out.println("List of cars after sorting:");
        for (int i = 0; i<4; i++) {
            System.out.println("Type of car #" + i + ": " + arrayCar[i].getType() + ". Year of production: " + String.format("%tY", arrayCar[i].getYearProduction()) + ". Engine capacity: " + arrayCar[i].getEngineCapacity());
        }

    }
}
