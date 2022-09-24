package KI_35.Skipar.Lab4;
/**
 *  Skipar package
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Abstract class <code>House</code> implement house
 */
public abstract class House {

    /**
     * Default constructor
     * @throws FileNotFoundException Not found log-file
     */
    public House() throws FileNotFoundException {
        fout = new PrintWriter("Log.txt");
        citizens = 0;
    }

    /**
     * Constructor
     * @param citizens count of citizens in the house
     * @param l brick length
     * @param w brick width
     * @param h brick height
     * @param br_count count of bricks
     * @param dr_count count of doors
     * @param wd_count count of windows
     * @throws FileNotFoundException Not found log-file
     */
    public House(int citizens, int l, int w, int h, int br_count, int dr_count, int wd_count) throws FileNotFoundException {
        this.citizens = citizens;
        set_brick(l, w, h, br_count);
        _door.setCount(dr_count);
        _window.setCount(wd_count);
        fout = new PrintWriter("Log.txt");
    }

    /**
     * Method set or change bricks in the house
     * @param c count of bricks
     * @param h brick height
     * @param l brick length
     * @param w brick width
     */
    public void set_brick(int l, int w, int h, int c) {
        _brick = new Brick(l,w,h,c);
    }

    /**
     * Method which return count of brick in the house
     * @return count of window
     */
    public int get_brick_count() {
        return _brick.getCount();
    }

    /**
     * Method which return bricks height in the house
     * @return count of window
     */
    public int get_brick_height() {
        return _brick.getHeight();
    }

    /**
     * Method which return bricks width in the house
     * @return count of window
     */
    public int get_brick_width() {
        return _brick.getWidth();
    }

    /**
     * Method which return brick length in the house
     * @return count of window
     */
    public int get_brick_length() {
        return _brick.getLength();
    }

    /**
     * Method which return count of door
     * @return count of doors
     */
    public int get_door() {
        return _door.getCount();
    }

    /**
     * Method set or change count of doors in the house
     * @param count doors count
     */
    public void set_door(int count) {
        _door = new Door(count);
    }

    /**
     * Method which return count of window
     * @return count of window
     */
    public int get_window() {
        return _window.getCount();
    }

    /**
     * Method set or change count of windows in the house
     * @param count windows count
     */
    public void set_window(int count) {
        _window = new Window(count);
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
     * @throws FileNotFoundException Not found log-file
     */
    public void setCitizens(int citizens) throws FileNotFoundException {
        if (this.citizens<citizens)
            fout.print(citizens-this.citizens + " new citizens in the house\n");
        else fout.print(this.citizens-citizens + " citizens leave the house\n");
        this.citizens = citizens;
        fout.flush();
    }

    /**
     * Method close log-file
     */
    public void closeFile () {
        fout.close();
    }

    private Brick _brick= new Brick();
    private Door _door = new Door();
    private Window _window = new Window();
    protected int citizens;
    protected PrintWriter fout;

}
