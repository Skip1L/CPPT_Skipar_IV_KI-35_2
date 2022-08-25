/**
 *  Skipar package
 */
package KI35.Skipar.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>House</code> implement house
 * @author Ілля
 * @version 1.0
 */
public class House {

    private int floors;
    private String street;
    private int citizens;
    private int number;
    private PrintWriter fout;

    /**
     * Constructor
     * @throws FileNotFoundException Not found log-file
     */
    public House() throws FileNotFoundException {
        fout = new PrintWriter("Log.txt");
        floors = 0;
        street = "Unknown";
        citizens = 0;
        number = 0;
    }

    /**
     * Constructor
     * @param street the street on which the house is located
     * @param number house number
     * @param floors count of floors in the house
     * @param citizens count of citizens in the house
     * @throws FileNotFoundException Not found log-file
     */
    public House(String street, int number, int floors, int citizens) throws FileNotFoundException {
        this.number = number;
        this.street = street;
        this.floors = floors;
        this.citizens = citizens;
        fout = new PrintWriter("Log.txt");
    }

    /**
     * Method returns house's current street name
     * @return house's current street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Method set or change house's current street name
     * @param street the street on which the house is located
     */
    public void setStreet(String street) {
        if (this.street.equals("Unknown"))
            fout.print("House is on " + street + " street\n");
        else fout.print("Street name changed to " + street + "\n");
        this.street = street;
        fout.flush();
    }

    /**
     * Method return count of floors in the house
     * @return count of house floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * Method set or change count of floors in the house
     * @param floors count of floors in the house
     */
    public void setFloors(int floors) {
        if (this.floors != 0 && this.floors>floors )
            fout.print( this.floors-floors + (this.floors-floors!=1?" floors were":" floor was") + " destroyed\n");
        else fout.print( floors-this.floors + (floors-this.floors!=1?" floors were":" floor was") + " built\n");
        this.floors = floors;
        fout.flush();
    }

    /**
     * Method return count of citizens in the house
     * @return count of citizens in the house
     */
    public int getCitizens() {
        return citizens;
    }

    /**
     * Method set or change count of citizens in the house
     * @param citizens count of citizens in the house
     */
    public void setCitizens(int citizens) {
        if (this.citizens<citizens)
            fout.print(citizens-this.citizens + " new citizens in the house\n");
        else fout.print(this.citizens-citizens + " citizens leave the house\n");
        this.citizens = citizens;
        fout.flush();
    }

    /**
     * Method return house number
     * @return house number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Method set or change current house number
     * @param number house number
     */
    public void setNumber(int number) {
        if (this.number == 0)
            fout.print("House is at " + number + " " + street + " street\n");
        else fout.print("House number changed to " + number + "\n");
        this.number = number;
        fout.flush();
    }

    /**
     * Method return average number of citizens on the floor
     * @return average number of citizens on the floor
     */
    public float citizenOnFloor (){
        return (float) this.citizens/this.floors;
    }
    /**
     * Method close log-file
     */
    public void closeFile () {
        fout.close();
    }

}
