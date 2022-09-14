package KI35.Skipar.Lab3;

/**
 * Class <code>Door</code> implement door
 * @author Ілля
 * @version 1.0
 */
public class Door {

    /**
     * Default constructor
     */
    public Door(){
        count = 0;
    }

    /**
     * A method which returns the count of doors
     * @return count of doors
     */
    public int getCount() {
        return count;
    }

    /**
     * A method which set the count of doors
     * @param count count of doors
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Constructor
     * @param count count of doors
     */
    public Door(int count) {
        this.count = count;
    }

    private int count;

}
