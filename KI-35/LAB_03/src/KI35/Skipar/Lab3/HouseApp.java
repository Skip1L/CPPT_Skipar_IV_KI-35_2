/**
 *  Skipar package
 */
package KI35.Skipar.Lab3;

import java.io.IOException;
import static java.lang.System.out;

/**
 *  House Application class implements main method for House
 class possibilities demonstration
 *  @author Ілля
 *  @version 1.0
 */
public class HouseApp {

    /**
     * @param args args
     * @throws IOException i/o exception
     */
    public static void main(String[] args) throws IOException {
        House my_house = new House("Bandera", 7,12, 156);

        out.print(my_house.getStreet() + "\n");
        my_house.setStreet("Chornovola");

        my_house.setFloors(13);
        out.print(my_house.getFloors() + "\n");

        my_house.setCitizens(166);
        out.print(my_house.citizenOnFloor() + "\n");

        my_house.setFloors(2);
        out.print(my_house.getFloors() + "\n");

        my_house.setCitizens(17);
        out.print(my_house.citizenOnFloor() + " " + my_house.getCitizens() + "\n");

        my_house.setNumber(9);
        out.print(my_house.getNumber() + "\n");

        my_house.closeFile();
    }

}
