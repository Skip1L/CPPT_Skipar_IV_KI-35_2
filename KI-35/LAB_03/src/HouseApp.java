/**
 *  Skipar package
 */

import KI35.Skipar.Lab3.House;

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
     * Main function
     * @param args args
     * @throws IOException i/o exception
     */
    public static void main(String[] args) throws IOException {
        House my_house = new House(15, 230, 120, 65,
                10000, 4, 8);
        out.print("Door: " + my_house.get_door());
        out.print("\nWindows: " + my_house.get_window());
        out.print("\nCitizens: " + my_house.getCitizens());
        out.print("\nBricks: " + my_house.get_brick_count());
        my_house.set_door(5);
        my_house.set_window(10);
        my_house.setCitizens(15);
        my_house.set_brick(230,120,80, 9500);
        out.print("\n\n\nDoor: " + my_house.get_door());
        out.print("\nWindows: " + my_house.get_window());
        out.print("\nCitizens: " + my_house.getCitizens());
        out.print("\nBricks: " + my_house.get_brick_count());

        my_house.closeFile();
    }

}
