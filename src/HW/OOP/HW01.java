package HW.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static HW.zTools.Readers.stringReader;


public class HW01 {

    class Person {
        private String Name;
        private Date BirthYear;

        private Person() throws ParseException {
            setInformation();
        }

        private Person(String name, Date birthYear) {
            this.Name = name;
            this.BirthYear = birthYear;
        }

        private void setName(String name) {
            this.Name = name;
        }

        private void setBirthYear(Date birthYear) {
            this.BirthYear = birthYear;
        }

        private String getName() {
            return this.Name;
        }

        private Date getBirthYear() {
            return this.BirthYear;
        }

        private int getAge() {
            Date curYear = new Date();
            int age = curYear.getYear() - this.getBirthYear().getYear();
            return age;
        }

        private void setInformation() throws ParseException {

            System.out.print("Input Name: ");
            String name = stringReader();
            System.out.print("Input Birth Year: ");
            Date birthYear = new SimpleDateFormat("yyyy").parse(stringReader());

            this.setName(name);
            this.setBirthYear(birthYear);
        }

        private void getInformation() {
            System.out.println("Person name: " + this.getName() + ". Year of birth: " + String.format("%tY", this.getBirthYear()) + ". Person age: " + this.getAge());
        }

        private void changeName() {
            System.out.print("Input new Name: ");
            String name = stringReader();
            this.setName(name);
            this.getInformation();
        }

    }

    public void runHW01() throws Exception {

        //first method
        System.out.println("First method");
        Person person01 = new Person();
        Person person02 = new Person();
        Person person03 = new Person();
        Person person04 = new Person();

        //second method
        System.out.println("Second method");
        System.out.print("Input Name: ");
        String name = stringReader();
        System.out.print("Input Birth Year: ");
        Date birthYear = new SimpleDateFormat("yyyy").parse(stringReader());
        Person person05 = new Person(name, birthYear);

        System.out.println("Getting information");
        person01.getInformation();
        person02.getInformation();
        person03.getInformation();
        person04.getInformation();
        person05.getInformation();

        System.out.println("Change Name");
        person01.changeName();

    }
}

