package KI_35.Skipar.Lab4;

/**
 * Class <code>KI_35.Skipar.Lab4.Window</code> implement window
 * @author Ілля
 * @version 1.0
 */
public class Window {

    /**
     * Default constructor
     */
    public Window(){
        count = 0;
    }

    /**
     * A method which returns the count of windows
     * @return count of windows
     */
    public int getCount() {
        return count;
    }

    /**
     * A method which set the count of windows
     * @param count count of windows
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Constructor
     * @param count count of windows
     */
    public Window(int count) {
        this.count = count;
    }

    private int count;

}
