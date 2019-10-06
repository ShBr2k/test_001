package HW.LoopsArray;

import java.util.Date;

/**
 * The Car class provide creation instance, setting and getting access to
 * the fields a class
 */
public class Car {
    private String Type;                // Type of Car
    private Date YearProduction;        // Year production of Car, type is Date
    private float EngineCapacity;       // Engine Capacity

    /**
     * Constructor Car provide creation of instances
     */
    public Car() {
    }

    /**
     * Method setType provide setting value type for instance
     */
    public void setType(String type) {
        this.Type = type;
    }

    /**
     * Method setYearProduction provide setting value yearProduction for instance
     */
    public void setYearProduction(Date yearProduction) {
        this.YearProduction = yearProduction;
    }

    /**
     * Method setEngineCapacity provide setting value EngineCapacity for instance
     */
    public void setEngineCapacity(float engineCapacity) {
        this.EngineCapacity = engineCapacity;
    }

    /**
     * Method getInformation provide reading all values of instance
     */
    public String getInformation(int numberCar) {
        String returnInformation = "Type of car #" + numberCar + ": " + this.getType() +
                ". Year of production: " + String.format("%tY", this.getYearProduction()) +
                ". Engine capacity: " + this.getEngineCapacity();
        return returnInformation;
    }

    /**
     * Method getType provide reading value Type of instance
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Method getYearProduction provide reading value YearProduction of instance
     */
    public Date getYearProduction() {
        return this.YearProduction;
    }

    /**
     * Method getEngineCapacity provide reading value EngineCapacity of instance
     */
    public float getEngineCapacity() {
        return this.EngineCapacity;
    }
}

